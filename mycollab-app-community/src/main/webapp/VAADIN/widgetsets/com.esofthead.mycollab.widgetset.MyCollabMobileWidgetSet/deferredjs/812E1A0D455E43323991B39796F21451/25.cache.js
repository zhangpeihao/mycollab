$wnd.com_esofthead_mycollab_widgetset_MyCollabMobileWidgetSet.runAsyncCallback25("function PHc(){}\nfunction RHc(){}\nfunction THc(){}\nfunction npd(){i$b.call(this)}\nfunction j1b(a,b){return IL(a.G.lo(b))}\nfunction PTd(){MZb.call(this);this.I=TFe;this.a=new u4d}\nfunction sTc(c,a){var b=c;a.notifyChildrenOfSizeChange=g9d(function(){b.Wk()})}\nfunction ATc(b){try{b!=null&&eval('{ var document = $doc; var window = $wnd; '+b+'}')}catch(a){}}\nfunction pTc(b){if(b&&b.iLayoutJS){try{b.iLayoutJS();return true}catch(a){return false}}else{return false}}\nfunction oTc(a,b){var c,d;for(c=P0d(new Q0d(a.f));c.a.Ug();){d=IL(V0d(c));if(PL(a.f.lo(d))===PL(b)){return d}}return null}\nfunction tTc(a,b){var c,d;d=oTc(a,b);d!=null&&a.f.oo(d);c=GL(a.a.lo(b),519);if(c){a.a.oo(b);return bd(a,c)}else if(b){return bd(a,b)}return false}\nfunction qTc(a){var b,c,d;d=(tub(),a._b).getElementsByTagName('IMG');for(b=0;b<d.length;b++){c=d[b];qub.Ag(c,ffe)}}\nfunction uTc(a,b){var c,d,e;if((Zt(),b).hasAttribute(jAe)){e=cu(b,jAe);a.e.no(e,b);It(b,'')}else{d=(tub(),Bwb(b));for(c=0;c<d;c++){uTc(a,Awb(b,c))}}}\nfunction vTc(a,b,c){var d,e;if(!b){return}d=HL(a.e.lo(c));if(!d&&a.d){throw new qZd('No location '+c+' found')}e=GL(a.f.lo(c),9);if(e==b){return}!!e&&tTc(a,e);a.d||(d=(tub(),a._b));Tc(a,b,(tub(),d));a.f.no(c,b)}\nfunction wTc(a,b){var c,d,e;d=b.Pd();if(d.$b!=a){return}e=GL(a.a.lo(d),519);if(z9b(b.Nd())){if(!e){c=oTc(a,d);bd(a,d);e=new H9b(b,a.b);Sc(a,e,HL(a.e.lo(c)));a.a.no(d,e)}u9b(e.a)}else{if(e){c=oTc(a,d);bd(a,e);Sc(a,d,HL(a.e.lo(c)));a.a.oo(d)}}}\nfunction LHc(c){var d={setter:function(a,b){a.b=b},getter:function(a){return a.b}};c.ok(dmb,PFe,d);var d={setter:function(a,b){a.c=b},getter:function(a){return a.c}};c.ok(dmb,QFe,d);var d={setter:function(a,b){a.a=b},getter:function(a){return a.a}};c.ok(dmb,RFe,d)}\nfunction xTc(){var a;cd.call(this);this.e=new u4d;this.f=new u4d;this.a=new u4d;lb(this,(tub(),Ov($doc)));a=this._b.style;Kx(a,Coe,(Qx(),s9d));Kx(a,Oqe,(sB(),Yae));Kx(a,$qe,Yae);(J3b(),!I3b&&(I3b=new $3b),J3b(),I3b).a.g&&Kx(a,J9d,(xA(),lae));Gt(this._b,TFe);Hb(this._b,Wye,true)}\nfunction mpd(a){var b,c;if(a.a){return}c=(!a.F&&(a.F=rg(a)),GL(GL(GL(a.F,6),114),387)).c;b=(!a.F&&(a.F=rg(a)),GL(GL(GL(a.F,6),114),387)).b;if(c!=null){b=j1b(a.u,'layouts/'+c+'.html');b==null&&It(bb(GL(Zg(a),242)),'<em>Layout file layouts/'+c+'.html is missing. Components will be drawn for debug purposes.<\\/em>')}b!=null&&rTc(GL(Zg(a),242),b,k1b(a.u));a.a=true}\nfunction rTc(a,b,c){var d;b=nTc(a,b);d=Ebc(c+'/layouts/');b=u$d(b,'<((?:img)|(?:IMG))\\\\s([^>]*)src=\"((?![a-z]+:)[^/][^\"]+)\"',SFe+d+'$3\"');b=u$d(b,'<((?:img)|(?:IMG))\\\\s([^>]*)src=[^\"]((?![a-z]+:)[^/][^ />]+)[ />]',SFe+d+'$3\"');b=u$d(b,'(<[^>]+style=\"[^\"]*url\\\\()((?![a-z]+:)[^/][^\"]+)(\\\\)[^>]*>)','$1 '+d+'$2 $3');It((tub(),a._b),b);a.e.Ic();uTc(a,a._b);qTc(a);a.c=Aub(a._b);!a.c&&(a.c=a._b);sTc(a,a.c);a.d=true}\nfunction nTc(a,b){var c,d,e,f,g,h,i,j;b=u$d(b,'_UID_',a.g+'__');a.i='';d=0;f=b.toLowerCase();h='';i=f.indexOf('<script',0);while(i>0){h+=b.substr(d,i-d);i=f.indexOf('>',i);e=f.indexOf('<\\/script>',i);a.i+=b.substr(i+1,e-(i+1))+';';g=d=e+9;i=f.indexOf('<script',g)}h+=E$d(b,d,b.length-d);f=h.toLowerCase();j=f.indexOf('<body');if(j<0){h=h}else{j=f.indexOf('>',j)+1;c=f.indexOf('<\\/body>',j);c>j?(h=h.substr(j,c-j)):(h=E$d(h,j,h.length-j))}return h}\nvar PFe='templateContents',QFe='templateName',RFe='childLocations',SFe='<$1 $2src=\"',TFe='v-customlayout';Eqb(1791,1,oqe);_.Ie=function OHc(){hKc(this.b,dmb,ulb);ZJc(this.b,Aue,Xfb);_Jc(this.b,dmb,Bue,new PHc);_Jc(this.b,Zab,Bue,new RHc);_Jc(this.b,Xfb,Bue,new THc);fKc(this.b,Xfb,yae,new RJc(dmb));fKc(this.b,Xfb,Jae,new RJc(Zab));LHc(this.b);dKc(this.b,dmb,PFe,new RJc(uob));dKc(this.b,dmb,QFe,new RJc(uob));dKc(this.b,dmb,RFe,new SJc(Nve,zL(vL(u9,1),Cue,4,0,[new RJc(Ykb),new RJc(uob)])));Xpc((!Qpc&&(Qpc=new bqc),Qpc),this.a.d)};Eqb(1793,1,Lxe,PHc);_.ik=function QHc(a,b){return new PTd};var w8=GYd(Kse,'ConnectorBundleLoaderImpl/25/1/1',1793);Eqb(1794,1,Lxe,RHc);_.ik=function SHc(a,b){return new xTc};var x8=GYd(Kse,'ConnectorBundleLoaderImpl/25/1/2',1794);Eqb(1795,1,Lxe,THc);_.ik=function UHc(a,b){return new npd};var y8=GYd(Kse,'ConnectorBundleLoaderImpl/25/1/3',1795);Eqb(242,202,{14:1,11:1,13:1,12:1,24:1,30:1,15:1,26:1,10:1,9:1,242:1,19:1},xTc);_.Hc=function yTc(a){throw new f_d};_.Ic=function zTc(){Nc(this);this.f.Ic();this.a.Ic()};_.Wk=function BTc(){};_.sc=function CTc(a){Ub(this,a);tub();if(nwb((Zt(),a).type)==ffe){k9b(this,true);mwb(a,true)}};_.tc=function DTc(){Vb(this);!!this.c&&(this.c.notifyChildrenOfSizeChange=null,undefined)};_.Jc=function ETc(a){return tTc(this,a)};_.jc=function FTc(a){Gt((tub(),this._b),a);Hb(this._b,Wye,true)};_.d=false;_.i='';var Zab=GYd(Aae,'VCustomLayout',242);Eqb(1792,498,{7:1,16:1,120:1,91:1,132:1,25:1,34:1,33:1,31:1,150:1,248:1,32:1,3:1},npd);_.Nd=function opd(){return !this.F&&(this.F=rg(this)),GL(GL(GL(this.F,6),114),387)};_.zd=function ppd(){return !this.F&&(this.F=rg(this)),GL(GL(GL(this.F,6),114),387)};_.yi=function qpd(){return !this.F&&(this.F=rg(this)),GL(GL(GL(this.F,6),114),387)};_.Pd=function rpd(){return GL(Zg(this),242)};_.Bd=function spd(){GL(Zg(this),242).b=this.u;GL(Zg(this),242).g=this.w};_.Fi=function tpd(){pTc((GL(Zg(this),242),Aub(bb(GL(Zg(this),242)))))};_.ke=function upd(b){var c,d,e,f,g,h;mpd(this);for(d=Zh(this).Pc();d.Ug();){c=GL(d.Vg(),16);e=IL((!this.F&&(this.F=rg(this)),GL(GL(GL(this.F,6),114),387)).a.lo(c));try{vTc(GL(Zg(this),242),c.Pd(),e)}catch(a){a=Bqb(a);if(KL(a,38)){B8d(D8d((AYd(Xfb),Xfb.k)),\"Child not rendered as no slot with id '\"+e+\"' has been defined\")}else throw Aqb(a)}}for(g=b.a.Pc();g.Ug();){f=GL(g.Vg(),16);if(f.xd()==this){continue}h=f.Pd();h.qc()&&tTc(GL(Zg(this),242),h)}};_.Dd=function vpd(a){_g(this,a);mpd(this);ATc(GL(Zg(this),242).i);GL(Zg(this),242).i=null};_.le=function wpd(a){wTc(GL(Zg(this),242),a)};_.ji=function xpd(a,b){};_.a=false;var Xfb=GYd('com.vaadin.client.ui.customlayout',kye,1792);Eqb(387,114,{6:1,41:1,114:1,387:1,3:1},PTd);var dmb=GYd('com.vaadin.shared.ui.customlayout','CustomLayoutState',387);g9d(Vq)(25);\n//# sourceURL=com.esofthead.mycollab.widgetset.MyCollabMobileWidgetSet-25.js\n")