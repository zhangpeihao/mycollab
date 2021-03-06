/**
 * Copyright © MyCollab
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.mycollab.mobile.module.crm.view.activity;

import com.mycollab.common.UrlEncodeDecoder;
import com.mycollab.common.i18n.GenericI18Enum;
import com.mycollab.core.MyCollabException;
import com.mycollab.vaadin.EventBusFactory;
import com.mycollab.mobile.module.crm.event.ActivityEvent;
import com.mycollab.mobile.module.crm.view.AbstractCrmPresenter;
import com.mycollab.mobile.shell.event.ShellEvent;
import com.mycollab.module.crm.domain.CallWithBLOBs;
import com.mycollab.module.crm.i18n.CallI18nEnum;
import com.mycollab.module.crm.service.CallService;
import com.mycollab.security.RolePermissionCollections;
import com.mycollab.spring.AppContextUtil;
import com.mycollab.vaadin.AppUI;
import com.mycollab.vaadin.UserUIContext;
import com.mycollab.vaadin.event.DefaultEditFormHandler;
import com.mycollab.vaadin.mvp.ScreenData;
import com.mycollab.vaadin.ui.NotificationUtil;
import com.vaadin.ui.HasComponents;

/**
 * @author MyCollab Ltd.
 * @since 4.1
 */
public class CallAddPresenter extends AbstractCrmPresenter<CallAddView> {
    private static final long serialVersionUID = 579102306602918760L;

    public CallAddPresenter() {
        super(CallAddView.class);
    }

    @Override
    protected void postInitView() {
        getView().getEditFormHandlers().addFormHandler(new DefaultEditFormHandler<CallWithBLOBs>() {
            private static final long serialVersionUID = 1L;

            @Override
            public void onSave(final CallWithBLOBs item) {
                save(item);
                EventBusFactory.getInstance().post(new ShellEvent.NavigateBack(this, null));
            }

            @Override
            public void onSaveAndNew(final CallWithBLOBs item) {
                save(item);
                EventBusFactory.getInstance().post(new ActivityEvent.CallAdd(this, null));
            }
        });
    }

    @Override
    protected void onGo(HasComponents container, ScreenData<?> data) {
        if (UserUIContext.canWrite(RolePermissionCollections.CRM_CALL)) {

            CallWithBLOBs call;

            if (data.getParams() instanceof Integer) {
                CallService callService = AppContextUtil.getSpringBean(CallService.class);
                call = callService.findByPrimaryKey((Integer) data.getParams(), AppUI.getAccountId());
                if (call == null) {
                    NotificationUtil.showRecordNotExistNotification();
                    return;
                }
            } else if (data.getParams() instanceof CallWithBLOBs) {
                call = (CallWithBLOBs) data.getParams();
            } else {
                throw new MyCollabException("Invalid data: " + data);
            }

            super.onGo(container, data);
            getView().editItem(call);
            if (call.getId() == null) {
                AppUI.addFragment("crm/activity/call/add/", UserUIContext.getMessage(GenericI18Enum.BROWSER_ADD_ITEM_TITLE,
                        UserUIContext.getMessage(CallI18nEnum.SINGLE)));
            } else {
                AppUI.addFragment("crm/activity/call/edit/" + UrlEncodeDecoder.encode(call.getId()),
                        UserUIContext.getMessage(GenericI18Enum.BROWSER_EDIT_ITEM_TITLE,
                                UserUIContext.getMessage(CallI18nEnum.SINGLE), call.getSubject()));
            }
        } else {
            NotificationUtil.showMessagePermissionAlert();
        }
    }

    public void save(CallWithBLOBs item) {
        CallService callService = AppContextUtil.getSpringBean(CallService.class);

        item.setSaccountid(AppUI.getAccountId());
        if (item.getId() == null) {
            callService.saveWithSession(item, UserUIContext.getUsername());
        } else {
            callService.updateWithSession(item, UserUIContext.getUsername());
        }

    }
}
