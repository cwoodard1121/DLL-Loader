package natives;
import com.itzblaze.Script;
import net.eq2online.macros.scripting.api.IMacro;
import net.eq2online.macros.scripting.api.IMacroAction;
import net.eq2online.macros.scripting.api.IScriptAction;
import net.eq2online.macros.scripting.api.IScriptActionProvider;
import net.eq2online.macros.scripting.actions.lang.ScriptActionSet;
import net.eq2online.macros.core.Macro;
import net.eq2online.macros.core.MacroPlaybackType;
import net.eq2online.macros.scripting.exceptions.ScriptExceptionVoidResult;
import net.eq2online.macros.scripting.Variable;
import com.itzblaze.FakeMacroAction;
import net.eq2online.macros.scripting.api.*;
import net.eq2online.macros.core.MacroTemplate;
import net.eq2online.macros.core.Macros;
import java.util.Iterator;
import net.eq2online.macros.core.executive.MacroActionContext;
import net.eq2online.util.Util;
import net.minecraft.client.Minecraft;
import net.eq2online.macros.core.*;
import net.eq2online.macros.scripting.parser.ScriptContext;
public class testlog extends Script {
@Override
public void run(IScriptActionProvider provider,IMacro m,IMacroAction instance,String[] hardArgs, boolean hasHardArgs) throws InterruptedException {
    Macro macro = new Macro(Macros.getInstance(), Minecraft.getMinecraft(),new MacroTemplate(Macros.getInstance(),Minecraft.getMinecraft(),9999),9999, MacroPlaybackType.ONESHOT, MacroTriggerType.NONE,
new MacroActionContext(ScriptContext.MAIN,provider,null));
String hardArg1 = null;
String hardArg2 = null; String hardArg3 = null; String hardArg4 = null;if(hasHardArgs) {
        for(int iPlusPlus = 0; iPlusPlus < hardArgs.length; iPlusPlus++) {
            if(iPlusPlus == 0) {
                hardArg1 = hardArgs[iPlusPlus];
            }
            if(iPlusPlus == 1) {
                hardArg2 = hardArgs[iPlusPlus];
            }
            if(iPlusPlus == 2) {
                hardArg3 = hardArgs[iPlusPlus];
            }
            if(iPlusPlus == 3) {
                hardArg4 = hardArgs[iPlusPlus];
            }
        }
 }
IMacroAction unsetFBZW99NSUSE6UYSFBYinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamsunset76HGBR7MLP3ZPMWEZG = "efficiency";
String[] paramsunset76HGBR7MLP3ZPMWEZG= "efficiency".split("SPLIT");
IScriptAction unset76HGBR7MLP3ZPMWEZG = newInstance("unset");
unset76HGBR7MLP3ZPMWEZG.execute(provider,macro,unsetFBZW99NSUSE6UYSFBYinstance,rawParamsunset76HGBR7MLP3ZPMWEZG,paramsunset76HGBR7MLP3ZPMWEZG);
while(!unset76HGBR7MLP3ZPMWEZG.canExecuteNow(provider,macro,unsetFBZW99NSUSE6UYSFBYinstance,rawParamsunset76HGBR7MLP3ZPMWEZG,paramsunset76HGBR7MLP3ZPMWEZG)){}
IMacroAction doBDMGHMN15713VTDLDQinstance = new FakeMacroAction();
do {
IMacroAction forRD2DV4SJEF6O1R5HVNinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamsfor9R05MMR1SWQOBUZOL9 = "#i = 9 to 43 step 1";
String[] paramsfor9R05MMR1SWQOBUZOL9= "#i = 9 to 43 step 1".split("SPLIT");
IScriptAction for9R05MMR1SWQOBUZOL9 = newInstance("for");
while(for9R05MMR1SWQOBUZOL9.executeStackPush(provider,macro,forRD2DV4SJEF6O1R5HVNinstance,rawParamsfor9R05MMR1SWQOBUZOL9,paramsfor9R05MMR1SWQOBUZOL9)) {
IMacroAction getslotiteminvELRUZ49UADDPENCWDIinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamsgetslotiteminvGZL9XNDBRWF6QZJXD4 = "%#i% &id #stacksize #data &nbt";
String[] paramsgetslotiteminvGZL9XNDBRWF6QZJXD4= "%#i%SPLIT&idSPLIT#stacksizeSPLIT#dataSPLIT&nbt".split("SPLIT");
IScriptAction getslotiteminvGZL9XNDBRWF6QZJXD4 = newInstance("getslotiteminv");
getslotiteminvGZL9XNDBRWF6QZJXD4.execute(provider,macro,getslotiteminvELRUZ49UADDPENCWDIinstance,rawParamsgetslotiteminvGZL9XNDBRWF6QZJXD4,paramsgetslotiteminvGZL9XNDBRWF6QZJXD4);
while(!getslotiteminvGZL9XNDBRWF6QZJXD4.canExecuteNow(provider,macro,getslotiteminvELRUZ49UADDPENCWDIinstance,rawParamsgetslotiteminvGZL9XNDBRWF6QZJXD4,paramsgetslotiteminvGZL9XNDBRWF6QZJXD4)){}
if(provider.getExpressionEvaluator(macro,provider.expand(macro,"&id == \"golden_shovel\"",true)).evaluate() != 0) {
IMacroAction assignKZ64U9JS0T64MMWX0Iinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamsassignJSV8R45GSZ5XL8QDFJ = "%#i%";
String[] paramsassignJSV8R45GSZ5XL8QDFJ= "#shovelslotSPLIT%#i%".split("SPLIT");
IScriptAction assignJSV8R45GSZ5XL8QDFJ = newInstance("assign");
assignJSV8R45GSZ5XL8QDFJ.execute(provider,macro,assignKZ64U9JS0T64MMWX0Iinstance,rawParamsassignJSV8R45GSZ5XL8QDFJ,paramsassignJSV8R45GSZ5XL8QDFJ);
while(!assignJSV8R45GSZ5XL8QDFJ.canExecuteNow(provider,macro,assignKZ64U9JS0T64MMWX0Iinstance,rawParamsassignJSV8R45GSZ5XL8QDFJ,paramsassignJSV8R45GSZ5XL8QDFJ)){}
IMacroAction set8QIBI61BTI7HE1MTKIinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamssetT4BOJRSU27YPEXSA1Q = "shovel";
String[] paramssetT4BOJRSU27YPEXSA1Q= "shovel".split("SPLIT");
IScriptAction setT4BOJRSU27YPEXSA1Q = newInstance("set");
setT4BOJRSU27YPEXSA1Q.execute(provider,macro,set8QIBI61BTI7HE1MTKIinstance,rawParamssetT4BOJRSU27YPEXSA1Q,paramssetT4BOJRSU27YPEXSA1Q);
while(!setT4BOJRSU27YPEXSA1Q.canExecuteNow(provider,macro,set8QIBI61BTI7HE1MTKIinstance,rawParamssetT4BOJRSU27YPEXSA1Q,paramssetT4BOJRSU27YPEXSA1Q)){}
IMacroAction ifcontainsOP044CF0GKMA5IZT22instance = new FakeMacroAction();
String rawParamsifcontainsNFG530BNDPRF3KNBMY = "%&nbt% efficiency";
String[] paramsifcontainsNFG530BNDPRF3KNBMY= "%&nbt%SPLITEfficiency".split("SPLIT");
IScriptAction ifcontainsNFG530BNDPRF3KNBMY = newInstance("ifcontains");
if(ifcontainsNFG530BNDPRF3KNBMY.executeConditional(provider,macro,ifcontainsOP044CF0GKMA5IZT22instance,rawParamsifcontainsNFG530BNDPRF3KNBMY,paramsifcontainsNFG530BNDPRF3KNBMY)) {
IMacroAction setOSTP2W3WTJA1VDMRGDinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamssetGFNGJG3QA5DBRVXRNX = "efficiency";
String[] paramssetGFNGJG3QA5DBRVXRNX= "efficiency".split("SPLIT");
IScriptAction setGFNGJG3QA5DBRVXRNX = newInstance("set");
setGFNGJG3QA5DBRVXRNX.execute(provider,macro,setOSTP2W3WTJA1VDMRGDinstance,rawParamssetGFNGJG3QA5DBRVXRNX,paramssetGFNGJG3QA5DBRVXRNX);
while(!setGFNGJG3QA5DBRVXRNX.canExecuteNow(provider,macro,setOSTP2W3WTJA1VDMRGDinstance,rawParamssetGFNGJG3QA5DBRVXRNX,paramssetGFNGJG3QA5DBRVXRNX)){}
}
break;
}
}
if(provider.getExpressionEvaluator(macro,provider.expand(macro,"#shovelslot != 36",true)).evaluate() != 0) {
IMacroAction do2S0ULAZOPJQGD6HNDXinstance = new FakeMacroAction();
do {
IMacroAction typeAMWATI448NEJVBYW18instance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamstypeD2K30G4JLQWALPJ67D = "e";
String[] paramstypeD2K30G4JLQWALPJ67D= "e".split("SPLIT");
IScriptAction typeD2K30G4JLQWALPJ67D = newInstance("type");
typeD2K30G4JLQWALPJ67D.execute(provider,macro,typeAMWATI448NEJVBYW18instance,rawParamstypeD2K30G4JLQWALPJ67D,paramstypeD2K30G4JLQWALPJ67D);
while(!typeD2K30G4JLQWALPJ67D.canExecuteNow(provider,macro,typeAMWATI448NEJVBYW18instance,rawParamstypeD2K30G4JLQWALPJ67D,paramstypeD2K30G4JLQWALPJ67D)){}
IMacroAction waitXIU3XFSZ7BN8CRGYROinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamswaitNFU8NRPVL379U8IHU3 = "1";
String[] paramswaitNFU8NRPVL379U8IHU3= "1".split("SPLIT");
IScriptAction waitNFU8NRPVL379U8IHU3 = newInstance("wait");
waitNFU8NRPVL379U8IHU3.execute(provider,macro,waitXIU3XFSZ7BN8CRGYROinstance,rawParamswaitNFU8NRPVL379U8IHU3,paramswaitNFU8NRPVL379U8IHU3);
while(!waitNFU8NRPVL379U8IHU3.canExecuteNow(provider,macro,waitXIU3XFSZ7BN8CRGYROinstance,rawParamswaitNFU8NRPVL379U8IHU3,paramswaitNFU8NRPVL379U8IHU3)){}
} while(provider.getExpressionEvaluator(macro,provider.expand(macro,"%gui%!=\"none\"",true)).evaluate() == 0);
IMacroAction slotclickFOL4N4JX5F3R0U3ECOinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamsslotclickJJ93G6RE6D6YFOVVLS = "%#shovelslot%";
String[] paramsslotclickJJ93G6RE6D6YFOVVLS= "%#shovelslot%".split("SPLIT");
IScriptAction slotclickJJ93G6RE6D6YFOVVLS = newInstance("slotclick");
slotclickJJ93G6RE6D6YFOVVLS.execute(provider,macro,slotclickFOL4N4JX5F3R0U3ECOinstance,rawParamsslotclickJJ93G6RE6D6YFOVVLS,paramsslotclickJJ93G6RE6D6YFOVVLS);
while(!slotclickJJ93G6RE6D6YFOVVLS.canExecuteNow(provider,macro,slotclickFOL4N4JX5F3R0U3ECOinstance,rawParamsslotclickJJ93G6RE6D6YFOVVLS,paramsslotclickJJ93G6RE6D6YFOVVLS)){}
IMacroAction waitQYWS40RTZ7ZBJDIV4Uinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamswaitE5YLBJ4B7AREOWV4JC = "500ms";
String[] paramswaitE5YLBJ4B7AREOWV4JC= "500ms".split("SPLIT");
IScriptAction waitE5YLBJ4B7AREOWV4JC = newInstance("wait");
waitE5YLBJ4B7AREOWV4JC.execute(provider,macro,waitQYWS40RTZ7ZBJDIV4Uinstance,rawParamswaitE5YLBJ4B7AREOWV4JC,paramswaitE5YLBJ4B7AREOWV4JC);
while(!waitE5YLBJ4B7AREOWV4JC.canExecuteNow(provider,macro,waitQYWS40RTZ7ZBJDIV4Uinstance,rawParamswaitE5YLBJ4B7AREOWV4JC,paramswaitE5YLBJ4B7AREOWV4JC)){}
IMacroAction slotclickVB5OOYVEH1M507JLDIinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamsslotclick44I61NY2I5JRJ2B1BL = "36";
String[] paramsslotclick44I61NY2I5JRJ2B1BL= "36".split("SPLIT");
IScriptAction slotclick44I61NY2I5JRJ2B1BL = newInstance("slotclick");
slotclick44I61NY2I5JRJ2B1BL.execute(provider,macro,slotclickVB5OOYVEH1M507JLDIinstance,rawParamsslotclick44I61NY2I5JRJ2B1BL,paramsslotclick44I61NY2I5JRJ2B1BL);
while(!slotclick44I61NY2I5JRJ2B1BL.canExecuteNow(provider,macro,slotclickVB5OOYVEH1M507JLDIinstance,rawParamsslotclick44I61NY2I5JRJ2B1BL,paramsslotclick44I61NY2I5JRJ2B1BL)){}
IMacroAction waitX9TLITZJ29JGVEGEP4instance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamswaitN0JO09LNKZI42I9EB6 = "500ms";
String[] paramswaitN0JO09LNKZI42I9EB6= "500ms".split("SPLIT");
IScriptAction waitN0JO09LNKZI42I9EB6 = newInstance("wait");
waitN0JO09LNKZI42I9EB6.execute(provider,macro,waitX9TLITZJ29JGVEGEP4instance,rawParamswaitN0JO09LNKZI42I9EB6,paramswaitN0JO09LNKZI42I9EB6);
while(!waitN0JO09LNKZI42I9EB6.canExecuteNow(provider,macro,waitX9TLITZJ29JGVEGEP4instance,rawParamswaitN0JO09LNKZI42I9EB6,paramswaitN0JO09LNKZI42I9EB6)){}
IMacroAction slotclick86RFUP3EQD9V3BSVRPinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamsslotclickS0Q1NQ6GUFROTWEFTX = "%#shovelslot%";
String[] paramsslotclickS0Q1NQ6GUFROTWEFTX= "%#shovelslot%".split("SPLIT");
IScriptAction slotclickS0Q1NQ6GUFROTWEFTX = newInstance("slotclick");
slotclickS0Q1NQ6GUFROTWEFTX.execute(provider,macro,slotclick86RFUP3EQD9V3BSVRPinstance,rawParamsslotclickS0Q1NQ6GUFROTWEFTX,paramsslotclickS0Q1NQ6GUFROTWEFTX);
while(!slotclickS0Q1NQ6GUFROTWEFTX.canExecuteNow(provider,macro,slotclick86RFUP3EQD9V3BSVRPinstance,rawParamsslotclickS0Q1NQ6GUFROTWEFTX,paramsslotclickS0Q1NQ6GUFROTWEFTX)){}
IMacroAction waitCL6W8VW3PNDM3WOAXGinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamswaitCHQDHBXA3KRKMPIN70 = "500ms";
String[] paramswaitCHQDHBXA3KRKMPIN70= "500ms".split("SPLIT");
IScriptAction waitCHQDHBXA3KRKMPIN70 = newInstance("wait");
waitCHQDHBXA3KRKMPIN70.execute(provider,macro,waitCL6W8VW3PNDM3WOAXGinstance,rawParamswaitCHQDHBXA3KRKMPIN70,paramswaitCHQDHBXA3KRKMPIN70);
while(!waitCHQDHBXA3KRKMPIN70.canExecuteNow(provider,macro,waitCL6W8VW3PNDM3WOAXGinstance,rawParamswaitCHQDHBXA3KRKMPIN70,paramswaitCHQDHBXA3KRKMPIN70)){}
IMacroAction doYT2YVN8E48MVL7MP4Zinstance = new FakeMacroAction();
do {
IMacroAction typeK0TSZ19FLG82U2SH6Minstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamstypeORD6D94H7YED2LVOCX = "e";
String[] paramstypeORD6D94H7YED2LVOCX= "e".split("SPLIT");
IScriptAction typeORD6D94H7YED2LVOCX = newInstance("type");
typeORD6D94H7YED2LVOCX.execute(provider,macro,typeK0TSZ19FLG82U2SH6Minstance,rawParamstypeORD6D94H7YED2LVOCX,paramstypeORD6D94H7YED2LVOCX);
while(!typeORD6D94H7YED2LVOCX.canExecuteNow(provider,macro,typeK0TSZ19FLG82U2SH6Minstance,rawParamstypeORD6D94H7YED2LVOCX,paramstypeORD6D94H7YED2LVOCX)){}
IMacroAction waitXEZQ1K75VYMMB3LYC2instance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamswait5DGP7ZT5VWQSLBK1H2 = "1";
String[] paramswait5DGP7ZT5VWQSLBK1H2= "1".split("SPLIT");
IScriptAction wait5DGP7ZT5VWQSLBK1H2 = newInstance("wait");
wait5DGP7ZT5VWQSLBK1H2.execute(provider,macro,waitXEZQ1K75VYMMB3LYC2instance,rawParamswait5DGP7ZT5VWQSLBK1H2,paramswait5DGP7ZT5VWQSLBK1H2);
while(!wait5DGP7ZT5VWQSLBK1H2.canExecuteNow(provider,macro,waitXEZQ1K75VYMMB3LYC2instance,rawParamswait5DGP7ZT5VWQSLBK1H2,paramswait5DGP7ZT5VWQSLBK1H2)){}
} while(provider.getExpressionEvaluator(macro,provider.expand(macro,"%gui%==\"none\"",true)).evaluate() == 0);
}
if(provider.getExpressionEvaluator(macro,provider.expand(macro,"shovel == false",true)).evaluate() != 0) {
IMacroAction execM3SJ7NLM35YIZV8QJAinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
Script.start("1_gotohub",provider,macro,instance,"GOTOHUB");
IMacroAction doSRHDW3T26TNX43A60Dinstance = new FakeMacroAction();
do {
} while(provider.getExpressionEvaluator(macro,provider.expand(macro,"@&place == \"hub\"",true)).evaluate() == 0);
IMacroAction assignP4UJYCD4LYLBTMI83Einstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamsassign8HD0JDIAV0RGOZ830R = "-51";
String[] paramsassign8HD0JDIAV0RGOZ830R= "#xSPLIT-51".split("SPLIT");
IScriptAction assign8HD0JDIAV0RGOZ830R = newInstance("assign");
assign8HD0JDIAV0RGOZ830R.execute(provider,macro,assignP4UJYCD4LYLBTMI83Einstance,rawParamsassign8HD0JDIAV0RGOZ830R,paramsassign8HD0JDIAV0RGOZ830R);
while(!assign8HD0JDIAV0RGOZ830R.canExecuteNow(provider,macro,assignP4UJYCD4LYLBTMI83Einstance,rawParamsassign8HD0JDIAV0RGOZ830R,paramsassign8HD0JDIAV0RGOZ830R)){}
IMacroAction assignLRG2R0R4M7TMTE6C4Ainstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamsassignKDOJ3SKNXSEWVBXPSF = "-68";
String[] paramsassignKDOJ3SKNXSEWVBXPSF= "#zSPLIT-68".split("SPLIT");
IScriptAction assignKDOJ3SKNXSEWVBXPSF = newInstance("assign");
assignKDOJ3SKNXSEWVBXPSF.execute(provider,macro,assignLRG2R0R4M7TMTE6C4Ainstance,rawParamsassignKDOJ3SKNXSEWVBXPSF,paramsassignKDOJ3SKNXSEWVBXPSF);
while(!assignKDOJ3SKNXSEWVBXPSF.canExecuteNow(provider,macro,assignLRG2R0R4M7TMTE6C4Ainstance,rawParamsassignKDOJ3SKNXSEWVBXPSF,paramsassignKDOJ3SKNXSEWVBXPSF)){}
IMacroAction doS9FIO9WDQCJAEZQ68Vinstance = new FakeMacroAction();
do {
IMacroAction calcyawtoGP3ZYHJQ4RT3CYJL66instance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamscalcyawtoXS3TTQMV9QL848L0BO = "-49.5 72 -68.5 #yaw #pitch #dist";
String[] paramscalcyawtoXS3TTQMV9QL848L0BO= "-49.5SPLIT72SPLIT-68.5SPLIT#yawSPLIT#pitchSPLIT#dist".split("SPLIT");
IScriptAction calcyawtoXS3TTQMV9QL848L0BO = newInstance("calcyawto");
calcyawtoXS3TTQMV9QL848L0BO.execute(provider,macro,calcyawtoGP3ZYHJQ4RT3CYJL66instance,rawParamscalcyawtoXS3TTQMV9QL848L0BO,paramscalcyawtoXS3TTQMV9QL848L0BO);
while(!calcyawtoXS3TTQMV9QL848L0BO.canExecuteNow(provider,macro,calcyawtoGP3ZYHJQ4RT3CYJL66instance,rawParamscalcyawtoXS3TTQMV9QL848L0BO,paramscalcyawtoXS3TTQMV9QL848L0BO)){}
IMacroAction assignPINQI1XQUX433TX277instance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamsassign7IBK352RWKLVNKV7UI = "%#yaw% + 180";
String[] paramsassign7IBK352RWKLVNKV7UI= "#yawSPLIT%#yaw% + 180".split("SPLIT");
IScriptAction assign7IBK352RWKLVNKV7UI = newInstance("assign");
assign7IBK352RWKLVNKV7UI.execute(provider,macro,assignPINQI1XQUX433TX277instance,rawParamsassign7IBK352RWKLVNKV7UI,paramsassign7IBK352RWKLVNKV7UI);
while(!assign7IBK352RWKLVNKV7UI.canExecuteNow(provider,macro,assignPINQI1XQUX433TX277instance,rawParamsassign7IBK352RWKLVNKV7UI,paramsassign7IBK352RWKLVNKV7UI)){}
IMacroAction gotoTXUVU98458ZHOKPNSRinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamsgotoFSHXNBPNZPTDHZWFEC = "%#x%  %#z%";
String[] paramsgotoFSHXNBPNZPTDHZWFEC= "%#x%SPLITSPLIT%#z%".split("SPLIT");
IScriptAction gotoFSHXNBPNZPTDHZWFEC = newInstance("goto");
gotoFSHXNBPNZPTDHZWFEC.execute(provider,macro,gotoTXUVU98458ZHOKPNSRinstance,rawParamsgotoFSHXNBPNZPTDHZWFEC,paramsgotoFSHXNBPNZPTDHZWFEC);
while(!gotoFSHXNBPNZPTDHZWFEC.canExecuteNow(provider,macro,gotoTXUVU98458ZHOKPNSRinstance,rawParamsgotoFSHXNBPNZPTDHZWFEC,paramsgotoFSHXNBPNZPTDHZWFEC)){}
IMacroAction looks22FT2FU9X7Q24PQD4Ginstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamslooks1M930HOATHF7I8DEZN = "%#yaw% 0 0.5";
String[] paramslooks1M930HOATHF7I8DEZN= "%#yaw%SPLIT0SPLIT0.5".split("SPLIT");
IScriptAction looks1M930HOATHF7I8DEZN = newInstance("looks");
looks1M930HOATHF7I8DEZN.execute(provider,macro,looks22FT2FU9X7Q24PQD4Ginstance,rawParamslooks1M930HOATHF7I8DEZN,paramslooks1M930HOATHF7I8DEZN);
while(!looks1M930HOATHF7I8DEZN.canExecuteNow(provider,macro,looks22FT2FU9X7Q24PQD4Ginstance,rawParamslooks1M930HOATHF7I8DEZN,paramslooks1M930HOATHF7I8DEZN)){}
} while(provider.getExpressionEvaluator(macro,provider.expand(macro,"(xpos==%#x%)&&(zpos==%#z%)",true)).evaluate() == 0);
IMacroAction calcyawto2MLWMLZ6TDCS7VK948instance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamscalcyawtoZ7GJ3VMX3GZ7EAA5M6 = "-49.5 72 -68.5 #yaw #pitch #dist";
String[] paramscalcyawtoZ7GJ3VMX3GZ7EAA5M6= "-49.5SPLIT72SPLIT-68.5SPLIT#yawSPLIT#pitchSPLIT#dist".split("SPLIT");
IScriptAction calcyawtoZ7GJ3VMX3GZ7EAA5M6 = newInstance("calcyawto");
calcyawtoZ7GJ3VMX3GZ7EAA5M6.execute(provider,macro,calcyawto2MLWMLZ6TDCS7VK948instance,rawParamscalcyawtoZ7GJ3VMX3GZ7EAA5M6,paramscalcyawtoZ7GJ3VMX3GZ7EAA5M6);
while(!calcyawtoZ7GJ3VMX3GZ7EAA5M6.canExecuteNow(provider,macro,calcyawto2MLWMLZ6TDCS7VK948instance,rawParamscalcyawtoZ7GJ3VMX3GZ7EAA5M6,paramscalcyawtoZ7GJ3VMX3GZ7EAA5M6)){}
IMacroAction assign69NSVC87QAZ8SKE2FKinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamsassignD58ZM71KDXERNCXD76 = "%#yaw% + 180";
String[] paramsassignD58ZM71KDXERNCXD76= "#yawSPLIT%#yaw% + 180".split("SPLIT");
IScriptAction assignD58ZM71KDXERNCXD76 = newInstance("assign");
assignD58ZM71KDXERNCXD76.execute(provider,macro,assign69NSVC87QAZ8SKE2FKinstance,rawParamsassignD58ZM71KDXERNCXD76,paramsassignD58ZM71KDXERNCXD76);
while(!assignD58ZM71KDXERNCXD76.canExecuteNow(provider,macro,assign69NSVC87QAZ8SKE2FKinstance,rawParamsassignD58ZM71KDXERNCXD76,paramsassignD58ZM71KDXERNCXD76)){}
IMacroAction looksHA3264QGBERYAI2G07instance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamslooksWTCD8JGGOC2NMHLRQM = "%#yaw% 0 0.5";
String[] paramslooksWTCD8JGGOC2NMHLRQM= "%#yaw%SPLIT0SPLIT0.5".split("SPLIT");
IScriptAction looksWTCD8JGGOC2NMHLRQM = newInstance("looks");
looksWTCD8JGGOC2NMHLRQM.execute(provider,macro,looksHA3264QGBERYAI2G07instance,rawParamslooksWTCD8JGGOC2NMHLRQM,paramslooksWTCD8JGGOC2NMHLRQM);
while(!looksWTCD8JGGOC2NMHLRQM.canExecuteNow(provider,macro,looksHA3264QGBERYAI2G07instance,rawParamslooksWTCD8JGGOC2NMHLRQM,paramslooksWTCD8JGGOC2NMHLRQM)){}
IMacroAction doZZ49NXHF47RCTSGFB1instance = new FakeMacroAction();
do {
IMacroAction keyKMMVGZ1326C2X427HNinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamskeyOW6NSZ0NYZTDZFP9N3 = "use";
String[] paramskeyOW6NSZ0NYZTDZFP9N3= "use".split("SPLIT");
IScriptAction keyOW6NSZ0NYZTDZFP9N3 = newInstance("key");
keyOW6NSZ0NYZTDZFP9N3.execute(provider,macro,keyKMMVGZ1326C2X427HNinstance,rawParamskeyOW6NSZ0NYZTDZFP9N3,paramskeyOW6NSZ0NYZTDZFP9N3);
while(!keyOW6NSZ0NYZTDZFP9N3.canExecuteNow(provider,macro,keyKMMVGZ1326C2X427HNinstance,rawParamskeyOW6NSZ0NYZTDZFP9N3,paramskeyOW6NSZ0NYZTDZFP9N3)){}
IMacroAction waitURGI056RNG233F8XKCinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamswaitD2WQYR6SVK3PKUNWSK = "1";
String[] paramswaitD2WQYR6SVK3PKUNWSK= "1".split("SPLIT");
IScriptAction waitD2WQYR6SVK3PKUNWSK = newInstance("wait");
waitD2WQYR6SVK3PKUNWSK.execute(provider,macro,waitURGI056RNG233F8XKCinstance,rawParamswaitD2WQYR6SVK3PKUNWSK,paramswaitD2WQYR6SVK3PKUNWSK);
while(!waitD2WQYR6SVK3PKUNWSK.canExecuteNow(provider,macro,waitURGI056RNG233F8XKCinstance,rawParamswaitD2WQYR6SVK3PKUNWSK,paramswaitD2WQYR6SVK3PKUNWSK)){}
} while(provider.getExpressionEvaluator(macro,provider.expand(macro,"%gui%!=\"none\"",true)).evaluate() == 0);
IMacroAction waitCLH4G2JY9TV81U12ENinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamswaitNYWR1YBMPN1ZVGX9F3 = "200ms";
String[] paramswaitNYWR1YBMPN1ZVGX9F3= "200ms".split("SPLIT");
IScriptAction waitNYWR1YBMPN1ZVGX9F3 = newInstance("wait");
waitNYWR1YBMPN1ZVGX9F3.execute(provider,macro,waitCLH4G2JY9TV81U12ENinstance,rawParamswaitNYWR1YBMPN1ZVGX9F3,paramswaitNYWR1YBMPN1ZVGX9F3);
while(!waitNYWR1YBMPN1ZVGX9F3.canExecuteNow(provider,macro,waitCLH4G2JY9TV81U12ENinstance,rawParamswaitNYWR1YBMPN1ZVGX9F3,paramswaitNYWR1YBMPN1ZVGX9F3)){}
IMacroAction slotclickXAEWNZYYVBLGXTMUATinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamsslotclickE0M0PI0N5AB4F5D1OD = "10";
String[] paramsslotclickE0M0PI0N5AB4F5D1OD= "10".split("SPLIT");
IScriptAction slotclickE0M0PI0N5AB4F5D1OD = newInstance("slotclick");
slotclickE0M0PI0N5AB4F5D1OD.execute(provider,macro,slotclickXAEWNZYYVBLGXTMUATinstance,rawParamsslotclickE0M0PI0N5AB4F5D1OD,paramsslotclickE0M0PI0N5AB4F5D1OD);
while(!slotclickE0M0PI0N5AB4F5D1OD.canExecuteNow(provider,macro,slotclickXAEWNZYYVBLGXTMUATinstance,rawParamsslotclickE0M0PI0N5AB4F5D1OD,paramsslotclickE0M0PI0N5AB4F5D1OD)){}
IMacroAction waitCRYFKIEVWM5YK2LKYTinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamswait76KAAIT4ZXG3GNL2PH = "8t";
String[] paramswait76KAAIT4ZXG3GNL2PH= "8t".split("SPLIT");
IScriptAction wait76KAAIT4ZXG3GNL2PH = newInstance("wait");
wait76KAAIT4ZXG3GNL2PH.execute(provider,macro,waitCRYFKIEVWM5YK2LKYTinstance,rawParamswait76KAAIT4ZXG3GNL2PH,paramswait76KAAIT4ZXG3GNL2PH);
while(!wait76KAAIT4ZXG3GNL2PH.canExecuteNow(provider,macro,waitCRYFKIEVWM5YK2LKYTinstance,rawParamswait76KAAIT4ZXG3GNL2PH,paramswait76KAAIT4ZXG3GNL2PH)){}
IMacroAction press6IO34F7CT959FP6KTHinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamspressTZ6B001KTTGAPENMVY = "e";
String[] paramspressTZ6B001KTTGAPENMVY= "e".split("SPLIT");
IScriptAction pressTZ6B001KTTGAPENMVY = newInstance("press");
pressTZ6B001KTTGAPENMVY.execute(provider,macro,press6IO34F7CT959FP6KTHinstance,rawParamspressTZ6B001KTTGAPENMVY,paramspressTZ6B001KTTGAPENMVY);
while(!pressTZ6B001KTTGAPENMVY.canExecuteNow(provider,macro,press6IO34F7CT959FP6KTHinstance,rawParamspressTZ6B001KTTGAPENMVY,paramspressTZ6B001KTTGAPENMVY)){}
IMacroAction waitY3JR9K0RPXYDX6X5FVinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamswaitZWNLYTDFJQO0SEOY8O = "10t";
String[] paramswaitZWNLYTDFJQO0SEOY8O= "10t".split("SPLIT");
IScriptAction waitZWNLYTDFJQO0SEOY8O = newInstance("wait");
waitZWNLYTDFJQO0SEOY8O.execute(provider,macro,waitY3JR9K0RPXYDX6X5FVinstance,rawParamswaitZWNLYTDFJQO0SEOY8O,paramswaitZWNLYTDFJQO0SEOY8O);
while(!waitZWNLYTDFJQO0SEOY8O.canExecuteNow(provider,macro,waitY3JR9K0RPXYDX6X5FVinstance,rawParamswaitZWNLYTDFJQO0SEOY8O,paramswaitZWNLYTDFJQO0SEOY8O)){}
IMacroAction slotHNZFC691XZQ7QE35AXinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamsslotYLB6U48JAL7K94KSF5 = "1";
String[] paramsslotYLB6U48JAL7K94KSF5= "1".split("SPLIT");
IScriptAction slotYLB6U48JAL7K94KSF5 = newInstance("slot");
slotYLB6U48JAL7K94KSF5.execute(provider,macro,slotHNZFC691XZQ7QE35AXinstance,rawParamsslotYLB6U48JAL7K94KSF5,paramsslotYLB6U48JAL7K94KSF5);
while(!slotYLB6U48JAL7K94KSF5.canExecuteNow(provider,macro,slotHNZFC691XZQ7QE35AXinstance,rawParamsslotYLB6U48JAL7K94KSF5,paramsslotYLB6U48JAL7K94KSF5)){}
IMacroAction pressWADUI2ZT5A2J2UISRMinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamspressQPSSFAUZMYNTLIUU3W = "e";
String[] paramspressQPSSFAUZMYNTLIUU3W= "e".split("SPLIT");
IScriptAction pressQPSSFAUZMYNTLIUU3W = newInstance("press");
pressQPSSFAUZMYNTLIUU3W.execute(provider,macro,pressWADUI2ZT5A2J2UISRMinstance,rawParamspressQPSSFAUZMYNTLIUU3W,paramspressQPSSFAUZMYNTLIUU3W);
while(!pressQPSSFAUZMYNTLIUU3W.canExecuteNow(provider,macro,pressWADUI2ZT5A2J2UISRMinstance,rawParamspressQPSSFAUZMYNTLIUU3W,paramspressQPSSFAUZMYNTLIUU3W)){}
IMacroAction waitH8JHK9BJ1PUPYM2NEEinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamswaitYE652LLQPTWF3MB091 = "8t";
String[] paramswaitYE652LLQPTWF3MB091= "8t".split("SPLIT");
IScriptAction waitYE652LLQPTWF3MB091 = newInstance("wait");
waitYE652LLQPTWF3MB091.execute(provider,macro,waitH8JHK9BJ1PUPYM2NEEinstance,rawParamswaitYE652LLQPTWF3MB091,paramswaitYE652LLQPTWF3MB091);
while(!waitYE652LLQPTWF3MB091.canExecuteNow(provider,macro,waitH8JHK9BJ1PUPYM2NEEinstance,rawParamswaitYE652LLQPTWF3MB091,paramswaitYE652LLQPTWF3MB091)){}
IMacroAction forMDX3AE1N519N1PZJY0instance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamsfor88KNWN19GMVFSZBHF8 = "#i 9 43";
String[] paramsfor88KNWN19GMVFSZBHF8= "#iSPLIT9SPLIT43".split("SPLIT");
IScriptAction for88KNWN19GMVFSZBHF8 = newInstance("for");
while(for88KNWN19GMVFSZBHF8.executeStackPush(provider,macro,forMDX3AE1N519N1PZJY0instance,rawParamsfor88KNWN19GMVFSZBHF8,paramsfor88KNWN19GMVFSZBHF8)) {
IMacroAction getslotitem8HEWV7YNZX8NQ0PKO9instance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamsgetslotitemO7XW59J1H9KHUX60LW = "%#i% &id #size";
String[] paramsgetslotitemO7XW59J1H9KHUX60LW= "%#i%SPLIT&idSPLIT#size".split("SPLIT");
IScriptAction getslotitemO7XW59J1H9KHUX60LW = newInstance("getslotitem");
getslotitemO7XW59J1H9KHUX60LW.execute(provider,macro,getslotitem8HEWV7YNZX8NQ0PKO9instance,rawParamsgetslotitemO7XW59J1H9KHUX60LW,paramsgetslotitemO7XW59J1H9KHUX60LW);
while(!getslotitemO7XW59J1H9KHUX60LW.canExecuteNow(provider,macro,getslotitem8HEWV7YNZX8NQ0PKO9instance,rawParamsgetslotitemO7XW59J1H9KHUX60LW,paramsgetslotitemO7XW59J1H9KHUX60LW)){}
if(provider.getExpressionEvaluator(macro,provider.expand(macro,"%&id% == \"log\"",true)).evaluate() != 0) {
IMacroAction slotclick6QSWJGH4SALLJEJ2UXinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamsslotclickVVWK9KMO9OOCBXBRW5 = "%#i%";
String[] paramsslotclickVVWK9KMO9OOCBXBRW5= "%#i%".split("SPLIT");
IScriptAction slotclickVVWK9KMO9OOCBXBRW5 = newInstance("slotclick");
slotclickVVWK9KMO9OOCBXBRW5.execute(provider,macro,slotclick6QSWJGH4SALLJEJ2UXinstance,rawParamsslotclickVVWK9KMO9OOCBXBRW5,paramsslotclickVVWK9KMO9OOCBXBRW5);
while(!slotclickVVWK9KMO9OOCBXBRW5.canExecuteNow(provider,macro,slotclick6QSWJGH4SALLJEJ2UXinstance,rawParamsslotclickVVWK9KMO9OOCBXBRW5,paramsslotclickVVWK9KMO9OOCBXBRW5)){}
IMacroAction waitA773HH8OGCCWLP7TXZinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamswaitH4HFCNKAFEZJB3IIQB = "500ms";
String[] paramswaitH4HFCNKAFEZJB3IIQB= "500ms".split("SPLIT");
IScriptAction waitH4HFCNKAFEZJB3IIQB = newInstance("wait");
waitH4HFCNKAFEZJB3IIQB.execute(provider,macro,waitA773HH8OGCCWLP7TXZinstance,rawParamswaitH4HFCNKAFEZJB3IIQB,paramswaitH4HFCNKAFEZJB3IIQB);
while(!waitH4HFCNKAFEZJB3IIQB.canExecuteNow(provider,macro,waitA773HH8OGCCWLP7TXZinstance,rawParamswaitH4HFCNKAFEZJB3IIQB,paramswaitH4HFCNKAFEZJB3IIQB)){}
break;
}
}
IMacroAction slotclickON9VLLGECP45V5C7L4instance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamsslotclickZ9K7UY2IIKQGGJG8QV = "1";
String[] paramsslotclickZ9K7UY2IIKQGGJG8QV= "1".split("SPLIT");
IScriptAction slotclickZ9K7UY2IIKQGGJG8QV = newInstance("slotclick");
slotclickZ9K7UY2IIKQGGJG8QV.execute(provider,macro,slotclickON9VLLGECP45V5C7L4instance,rawParamsslotclickZ9K7UY2IIKQGGJG8QV,paramsslotclickZ9K7UY2IIKQGGJG8QV);
while(!slotclickZ9K7UY2IIKQGGJG8QV.canExecuteNow(provider,macro,slotclickON9VLLGECP45V5C7L4instance,rawParamsslotclickZ9K7UY2IIKQGGJG8QV,paramsslotclickZ9K7UY2IIKQGGJG8QV)){}
IMacroAction wait16U29MNSVJWRWCAI1Yinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamswaitVY70GP1STV2IEBBFBG = "8t";
String[] paramswaitVY70GP1STV2IEBBFBG= "8t".split("SPLIT");
IScriptAction waitVY70GP1STV2IEBBFBG = newInstance("wait");
waitVY70GP1STV2IEBBFBG.execute(provider,macro,wait16U29MNSVJWRWCAI1Yinstance,rawParamswaitVY70GP1STV2IEBBFBG,paramswaitVY70GP1STV2IEBBFBG);
while(!waitVY70GP1STV2IEBBFBG.canExecuteNow(provider,macro,wait16U29MNSVJWRWCAI1Yinstance,rawParamswaitVY70GP1STV2IEBBFBG,paramswaitVY70GP1STV2IEBBFBG)){}
IMacroAction slotclickP2GB1ETY96B1YUTOK9instance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamsslotclickTROAHI0AEH89LN5WDX = "0 left true";
String[] paramsslotclickTROAHI0AEH89LN5WDX= "0SPLITleftSPLITtrue".split("SPLIT");
IScriptAction slotclickTROAHI0AEH89LN5WDX = newInstance("slotclick");
slotclickTROAHI0AEH89LN5WDX.execute(provider,macro,slotclickP2GB1ETY96B1YUTOK9instance,rawParamsslotclickTROAHI0AEH89LN5WDX,paramsslotclickTROAHI0AEH89LN5WDX);
while(!slotclickTROAHI0AEH89LN5WDX.canExecuteNow(provider,macro,slotclickP2GB1ETY96B1YUTOK9instance,rawParamsslotclickTROAHI0AEH89LN5WDX,paramsslotclickTROAHI0AEH89LN5WDX)){}
IMacroAction waitU2SZVMA14W2WWVZAF3instance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamswaitEM63J2Q8J2XQ6IHINE = "300ms";
String[] paramswaitEM63J2Q8J2XQ6IHINE= "300ms".split("SPLIT");
IScriptAction waitEM63J2Q8J2XQ6IHINE = newInstance("wait");
waitEM63J2Q8J2XQ6IHINE.execute(provider,macro,waitU2SZVMA14W2WWVZAF3instance,rawParamswaitEM63J2Q8J2XQ6IHINE,paramswaitEM63J2Q8J2XQ6IHINE);
while(!waitEM63J2Q8J2XQ6IHINE.canExecuteNow(provider,macro,waitU2SZVMA14W2WWVZAF3instance,rawParamswaitEM63J2Q8J2XQ6IHINE,paramswaitEM63J2Q8J2XQ6IHINE)){}
IMacroAction forFSUNQ5F0671KAKXEGVinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamsforRFU31XXI8LPF2TW4FG = "#i 9 43";
String[] paramsforRFU31XXI8LPF2TW4FG= "#iSPLIT9SPLIT43".split("SPLIT");
IScriptAction forRFU31XXI8LPF2TW4FG = newInstance("for");
while(forRFU31XXI8LPF2TW4FG.executeStackPush(provider,macro,forFSUNQ5F0671KAKXEGVinstance,rawParamsforRFU31XXI8LPF2TW4FG,paramsforRFU31XXI8LPF2TW4FG)) {
IMacroAction getslotitemDVYRUF364DFBPL9FP0instance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamsgetslotitemVX31BPJCHDX8QYYH0U = "%#i% &id #size";
String[] paramsgetslotitemVX31BPJCHDX8QYYH0U= "%#i%SPLIT&idSPLIT#size".split("SPLIT");
IScriptAction getslotitemVX31BPJCHDX8QYYH0U = newInstance("getslotitem");
getslotitemVX31BPJCHDX8QYYH0U.execute(provider,macro,getslotitemDVYRUF364DFBPL9FP0instance,rawParamsgetslotitemVX31BPJCHDX8QYYH0U,paramsgetslotitemVX31BPJCHDX8QYYH0U);
while(!getslotitemVX31BPJCHDX8QYYH0U.canExecuteNow(provider,macro,getslotitemDVYRUF364DFBPL9FP0instance,rawParamsgetslotitemVX31BPJCHDX8QYYH0U,paramsgetslotitemVX31BPJCHDX8QYYH0U)){}
if(provider.getExpressionEvaluator(macro,provider.expand(macro,"%&id% == \"planks\"",true)).evaluate() != 0) {
IMacroAction slotclick9RF3SKBML7PAE3N4GYinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamsslotclick5OLQEKUITA607BU1QB = "%#i%";
String[] paramsslotclick5OLQEKUITA607BU1QB= "%#i%".split("SPLIT");
IScriptAction slotclick5OLQEKUITA607BU1QB = newInstance("slotclick");
slotclick5OLQEKUITA607BU1QB.execute(provider,macro,slotclick9RF3SKBML7PAE3N4GYinstance,rawParamsslotclick5OLQEKUITA607BU1QB,paramsslotclick5OLQEKUITA607BU1QB);
while(!slotclick5OLQEKUITA607BU1QB.canExecuteNow(provider,macro,slotclick9RF3SKBML7PAE3N4GYinstance,rawParamsslotclick5OLQEKUITA607BU1QB,paramsslotclick5OLQEKUITA607BU1QB)){}
IMacroAction waitDTU6YMTKE5LBH1P9GKinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamswaitEML08YRJLF62Z9QGRP = "500ms";
String[] paramswaitEML08YRJLF62Z9QGRP= "500ms".split("SPLIT");
IScriptAction waitEML08YRJLF62Z9QGRP = newInstance("wait");
waitEML08YRJLF62Z9QGRP.execute(provider,macro,waitDTU6YMTKE5LBH1P9GKinstance,rawParamswaitEML08YRJLF62Z9QGRP,paramswaitEML08YRJLF62Z9QGRP);
while(!waitEML08YRJLF62Z9QGRP.canExecuteNow(provider,macro,waitDTU6YMTKE5LBH1P9GKinstance,rawParamswaitEML08YRJLF62Z9QGRP,paramswaitEML08YRJLF62Z9QGRP)){}
break;
}
}
IMacroAction slotclick8FQDKA8PO3BFU8JE23instance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamsslotclickR0EBLLQA3B8O74B952 = "1";
String[] paramsslotclickR0EBLLQA3B8O74B952= "1".split("SPLIT");
IScriptAction slotclickR0EBLLQA3B8O74B952 = newInstance("slotclick");
slotclickR0EBLLQA3B8O74B952.execute(provider,macro,slotclick8FQDKA8PO3BFU8JE23instance,rawParamsslotclickR0EBLLQA3B8O74B952,paramsslotclickR0EBLLQA3B8O74B952);
while(!slotclickR0EBLLQA3B8O74B952.canExecuteNow(provider,macro,slotclick8FQDKA8PO3BFU8JE23instance,rawParamsslotclickR0EBLLQA3B8O74B952,paramsslotclickR0EBLLQA3B8O74B952)){}
IMacroAction waitZ685NM6CPN750PJQ61instance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamswait5TOSEWZR53J1FG11AM = "8t";
String[] paramswait5TOSEWZR53J1FG11AM= "8t".split("SPLIT");
IScriptAction wait5TOSEWZR53J1FG11AM = newInstance("wait");
wait5TOSEWZR53J1FG11AM.execute(provider,macro,waitZ685NM6CPN750PJQ61instance,rawParamswait5TOSEWZR53J1FG11AM,paramswait5TOSEWZR53J1FG11AM);
while(!wait5TOSEWZR53J1FG11AM.canExecuteNow(provider,macro,waitZ685NM6CPN750PJQ61instance,rawParamswait5TOSEWZR53J1FG11AM,paramswait5TOSEWZR53J1FG11AM)){}
IMacroAction slotclickM6CBO00MZ744A1LY9Finstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamsslotclickY9B9AOS2VUBAB6NV7B = "1 right false";
String[] paramsslotclickY9B9AOS2VUBAB6NV7B= "1SPLITrightSPLITfalse".split("SPLIT");
IScriptAction slotclickY9B9AOS2VUBAB6NV7B = newInstance("slotclick");
slotclickY9B9AOS2VUBAB6NV7B.execute(provider,macro,slotclickM6CBO00MZ744A1LY9Finstance,rawParamsslotclickY9B9AOS2VUBAB6NV7B,paramsslotclickY9B9AOS2VUBAB6NV7B);
while(!slotclickY9B9AOS2VUBAB6NV7B.canExecuteNow(provider,macro,slotclickM6CBO00MZ744A1LY9Finstance,rawParamsslotclickY9B9AOS2VUBAB6NV7B,paramsslotclickY9B9AOS2VUBAB6NV7B)){}
IMacroAction waitMN9423J5JE7UD9CWOIinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamswait96N773Z1EJL7H08V4L = "8t";
String[] paramswait96N773Z1EJL7H08V4L= "8t".split("SPLIT");
IScriptAction wait96N773Z1EJL7H08V4L = newInstance("wait");
wait96N773Z1EJL7H08V4L.execute(provider,macro,waitMN9423J5JE7UD9CWOIinstance,rawParamswait96N773Z1EJL7H08V4L,paramswait96N773Z1EJL7H08V4L);
while(!wait96N773Z1EJL7H08V4L.canExecuteNow(provider,macro,waitMN9423J5JE7UD9CWOIinstance,rawParamswait96N773Z1EJL7H08V4L,paramswait96N773Z1EJL7H08V4L)){}
IMacroAction slotclickJ3Q1V8S6FRJD77H7TZinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamsslotclickKJWAQ5MUTT3URYKQH2 = "3";
String[] paramsslotclickKJWAQ5MUTT3URYKQH2= "3".split("SPLIT");
IScriptAction slotclickKJWAQ5MUTT3URYKQH2 = newInstance("slotclick");
slotclickKJWAQ5MUTT3URYKQH2.execute(provider,macro,slotclickJ3Q1V8S6FRJD77H7TZinstance,rawParamsslotclickKJWAQ5MUTT3URYKQH2,paramsslotclickKJWAQ5MUTT3URYKQH2);
while(!slotclickKJWAQ5MUTT3URYKQH2.canExecuteNow(provider,macro,slotclickJ3Q1V8S6FRJD77H7TZinstance,rawParamsslotclickKJWAQ5MUTT3URYKQH2,paramsslotclickKJWAQ5MUTT3URYKQH2)){}
IMacroAction wait2PKZ9AWW3NZ1SOJEC4instance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamswaitHCZAF30GMYTCUMFO27 = "8t";
String[] paramswaitHCZAF30GMYTCUMFO27= "8t".split("SPLIT");
IScriptAction waitHCZAF30GMYTCUMFO27 = newInstance("wait");
waitHCZAF30GMYTCUMFO27.execute(provider,macro,wait2PKZ9AWW3NZ1SOJEC4instance,rawParamswaitHCZAF30GMYTCUMFO27,paramswaitHCZAF30GMYTCUMFO27);
while(!waitHCZAF30GMYTCUMFO27.canExecuteNow(provider,macro,wait2PKZ9AWW3NZ1SOJEC4instance,rawParamswaitHCZAF30GMYTCUMFO27,paramswaitHCZAF30GMYTCUMFO27)){}
IMacroAction slotclickZX7KUG7A1WFWDY207Hinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamsslotclick56X8NEB3KV019M4JKJ = "0 left true";
String[] paramsslotclick56X8NEB3KV019M4JKJ= "0SPLITleftSPLITtrue".split("SPLIT");
IScriptAction slotclick56X8NEB3KV019M4JKJ = newInstance("slotclick");
slotclick56X8NEB3KV019M4JKJ.execute(provider,macro,slotclickZX7KUG7A1WFWDY207Hinstance,rawParamsslotclick56X8NEB3KV019M4JKJ,paramsslotclick56X8NEB3KV019M4JKJ);
while(!slotclick56X8NEB3KV019M4JKJ.canExecuteNow(provider,macro,slotclickZX7KUG7A1WFWDY207Hinstance,rawParamsslotclick56X8NEB3KV019M4JKJ,paramsslotclick56X8NEB3KV019M4JKJ)){}
IMacroAction wait711VV1K9Q9YLDZ9TGXinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamswaitN8O8TZ0GUOZTITPTGO = "8t";
String[] paramswaitN8O8TZ0GUOZTITPTGO= "8t".split("SPLIT");
IScriptAction waitN8O8TZ0GUOZTITPTGO = newInstance("wait");
waitN8O8TZ0GUOZTITPTGO.execute(provider,macro,wait711VV1K9Q9YLDZ9TGXinstance,rawParamswaitN8O8TZ0GUOZTITPTGO,paramswaitN8O8TZ0GUOZTITPTGO);
while(!waitN8O8TZ0GUOZTITPTGO.canExecuteNow(provider,macro,wait711VV1K9Q9YLDZ9TGXinstance,rawParamswaitN8O8TZ0GUOZTITPTGO,paramswaitN8O8TZ0GUOZTITPTGO)){}
IMacroAction pressY96INYXI71Y9PKGEKJinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamspress3Y9FRAMHL1H8VVDYOH = "e";
String[] paramspress3Y9FRAMHL1H8VVDYOH= "e".split("SPLIT");
IScriptAction press3Y9FRAMHL1H8VVDYOH = newInstance("press");
press3Y9FRAMHL1H8VVDYOH.execute(provider,macro,pressY96INYXI71Y9PKGEKJinstance,rawParamspress3Y9FRAMHL1H8VVDYOH,paramspress3Y9FRAMHL1H8VVDYOH);
while(!press3Y9FRAMHL1H8VVDYOH.canExecuteNow(provider,macro,pressY96INYXI71Y9PKGEKJinstance,rawParamspress3Y9FRAMHL1H8VVDYOH,paramspress3Y9FRAMHL1H8VVDYOH)){}
IMacroAction waitYT622N1M44DO947RCFinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamswait4KTRFCOPAPQU8Y6UUO = "8t";
String[] paramswait4KTRFCOPAPQU8Y6UUO= "8t".split("SPLIT");
IScriptAction wait4KTRFCOPAPQU8Y6UUO = newInstance("wait");
wait4KTRFCOPAPQU8Y6UUO.execute(provider,macro,waitYT622N1M44DO947RCFinstance,rawParamswait4KTRFCOPAPQU8Y6UUO,paramswait4KTRFCOPAPQU8Y6UUO);
while(!wait4KTRFCOPAPQU8Y6UUO.canExecuteNow(provider,macro,waitYT622N1M44DO947RCFinstance,rawParamswait4KTRFCOPAPQU8Y6UUO,paramswait4KTRFCOPAPQU8Y6UUO)){}
IMacroAction assign9M5GT2AOZSOAF9FOCYinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamsassign1U77LXBUU1JUNWIB5I = "-9";
String[] paramsassign1U77LXBUU1JUNWIB5I= "#xSPLIT-9".split("SPLIT");
IScriptAction assign1U77LXBUU1JUNWIB5I = newInstance("assign");
assign1U77LXBUU1JUNWIB5I.execute(provider,macro,assign9M5GT2AOZSOAF9FOCYinstance,rawParamsassign1U77LXBUU1JUNWIB5I,paramsassign1U77LXBUU1JUNWIB5I);
while(!assign1U77LXBUU1JUNWIB5I.canExecuteNow(provider,macro,assign9M5GT2AOZSOAF9FOCYinstance,rawParamsassign1U77LXBUU1JUNWIB5I,paramsassign1U77LXBUU1JUNWIB5I)){}
IMacroAction assignGBD64SFZRZK5CJIPZ6instance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamsassignZ2MH1ZV3CP813AWF91 = "-127";
String[] paramsassignZ2MH1ZV3CP813AWF91= "#zSPLIT-127".split("SPLIT");
IScriptAction assignZ2MH1ZV3CP813AWF91 = newInstance("assign");
assignZ2MH1ZV3CP813AWF91.execute(provider,macro,assignGBD64SFZRZK5CJIPZ6instance,rawParamsassignZ2MH1ZV3CP813AWF91,paramsassignZ2MH1ZV3CP813AWF91);
while(!assignZ2MH1ZV3CP813AWF91.canExecuteNow(provider,macro,assignGBD64SFZRZK5CJIPZ6instance,rawParamsassignZ2MH1ZV3CP813AWF91,paramsassignZ2MH1ZV3CP813AWF91)){}
IMacroAction do41JTCY1LHM5ZIFC33Hinstance = new FakeMacroAction();
do {
IMacroAction calcyawtoUOLNFIW7EIBCIQI4ROinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamscalcyawtoUL3T5HGN2MUOPUTFYP = "-9.1 69 -125 #yaw #pitch #dist";
String[] paramscalcyawtoUL3T5HGN2MUOPUTFYP= "-9.1SPLIT69SPLIT-125SPLIT#yawSPLIT#pitchSPLIT#dist".split("SPLIT");
IScriptAction calcyawtoUL3T5HGN2MUOPUTFYP = newInstance("calcyawto");
calcyawtoUL3T5HGN2MUOPUTFYP.execute(provider,macro,calcyawtoUOLNFIW7EIBCIQI4ROinstance,rawParamscalcyawtoUL3T5HGN2MUOPUTFYP,paramscalcyawtoUL3T5HGN2MUOPUTFYP);
while(!calcyawtoUL3T5HGN2MUOPUTFYP.canExecuteNow(provider,macro,calcyawtoUOLNFIW7EIBCIQI4ROinstance,rawParamscalcyawtoUL3T5HGN2MUOPUTFYP,paramscalcyawtoUL3T5HGN2MUOPUTFYP)){}
IMacroAction assignLCN5Z58M8U7D2MRKUQinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamsassignQ7928YU5077IC2217B = "%#yaw% + 180";
String[] paramsassignQ7928YU5077IC2217B= "#yawSPLIT%#yaw% + 180".split("SPLIT");
IScriptAction assignQ7928YU5077IC2217B = newInstance("assign");
assignQ7928YU5077IC2217B.execute(provider,macro,assignLCN5Z58M8U7D2MRKUQinstance,rawParamsassignQ7928YU5077IC2217B,paramsassignQ7928YU5077IC2217B);
while(!assignQ7928YU5077IC2217B.canExecuteNow(provider,macro,assignLCN5Z58M8U7D2MRKUQinstance,rawParamsassignQ7928YU5077IC2217B,paramsassignQ7928YU5077IC2217B)){}
IMacroAction gotoPMZTAZ7XHK2CHTPIQOinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamsgotoZ35ZPDUDC1GBWIOHZK = "%#x%  %#z%";
String[] paramsgotoZ35ZPDUDC1GBWIOHZK= "%#x%SPLITSPLIT%#z%".split("SPLIT");
IScriptAction gotoZ35ZPDUDC1GBWIOHZK = newInstance("goto");
gotoZ35ZPDUDC1GBWIOHZK.execute(provider,macro,gotoPMZTAZ7XHK2CHTPIQOinstance,rawParamsgotoZ35ZPDUDC1GBWIOHZK,paramsgotoZ35ZPDUDC1GBWIOHZK);
while(!gotoZ35ZPDUDC1GBWIOHZK.canExecuteNow(provider,macro,gotoPMZTAZ7XHK2CHTPIQOinstance,rawParamsgotoZ35ZPDUDC1GBWIOHZK,paramsgotoZ35ZPDUDC1GBWIOHZK)){}
IMacroAction looks9SZ9E9DERD0HC2HLAUinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamslooksWK8NLUAKVWA4RK8BBN = "%#yaw% 0 0.5";
String[] paramslooksWK8NLUAKVWA4RK8BBN= "%#yaw%SPLIT0SPLIT0.5".split("SPLIT");
IScriptAction looksWK8NLUAKVWA4RK8BBN = newInstance("looks");
looksWK8NLUAKVWA4RK8BBN.execute(provider,macro,looks9SZ9E9DERD0HC2HLAUinstance,rawParamslooksWK8NLUAKVWA4RK8BBN,paramslooksWK8NLUAKVWA4RK8BBN);
while(!looksWK8NLUAKVWA4RK8BBN.canExecuteNow(provider,macro,looks9SZ9E9DERD0HC2HLAUinstance,rawParamslooksWK8NLUAKVWA4RK8BBN,paramslooksWK8NLUAKVWA4RK8BBN)){}
} while(provider.getExpressionEvaluator(macro,provider.expand(macro,"(xpos==%#x%)&&(zpos==%#z%)",true)).evaluate() == 0);
IMacroAction calcyawtoTKOEAFD22HFLN1D310instance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamscalcyawtoMMSRR206PPHXCSMFJU = "-9.1 69 -125 #yaw #pitch #dist";
String[] paramscalcyawtoMMSRR206PPHXCSMFJU= "-9.1SPLIT69SPLIT-125SPLIT#yawSPLIT#pitchSPLIT#dist".split("SPLIT");
IScriptAction calcyawtoMMSRR206PPHXCSMFJU = newInstance("calcyawto");
calcyawtoMMSRR206PPHXCSMFJU.execute(provider,macro,calcyawtoTKOEAFD22HFLN1D310instance,rawParamscalcyawtoMMSRR206PPHXCSMFJU,paramscalcyawtoMMSRR206PPHXCSMFJU);
while(!calcyawtoMMSRR206PPHXCSMFJU.canExecuteNow(provider,macro,calcyawtoTKOEAFD22HFLN1D310instance,rawParamscalcyawtoMMSRR206PPHXCSMFJU,paramscalcyawtoMMSRR206PPHXCSMFJU)){}
IMacroAction assignF9V9C4DGC7L1U56RRTinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamsassignXU9WS9PFY1YRXA7S0L = "%#yaw% + 180";
String[] paramsassignXU9WS9PFY1YRXA7S0L= "#yawSPLIT%#yaw% + 180".split("SPLIT");
IScriptAction assignXU9WS9PFY1YRXA7S0L = newInstance("assign");
assignXU9WS9PFY1YRXA7S0L.execute(provider,macro,assignF9V9C4DGC7L1U56RRTinstance,rawParamsassignXU9WS9PFY1YRXA7S0L,paramsassignXU9WS9PFY1YRXA7S0L);
while(!assignXU9WS9PFY1YRXA7S0L.canExecuteNow(provider,macro,assignF9V9C4DGC7L1U56RRTinstance,rawParamsassignXU9WS9PFY1YRXA7S0L,paramsassignXU9WS9PFY1YRXA7S0L)){}
IMacroAction looksEWESJZIGLPU3RGT1TXinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamslooksK7C617CTK0MTNJVUJQ = "%#yaw% 0 0.5";
String[] paramslooksK7C617CTK0MTNJVUJQ= "%#yaw%SPLIT0SPLIT0.5".split("SPLIT");
IScriptAction looksK7C617CTK0MTNJVUJQ = newInstance("looks");
looksK7C617CTK0MTNJVUJQ.execute(provider,macro,looksEWESJZIGLPU3RGT1TXinstance,rawParamslooksK7C617CTK0MTNJVUJQ,paramslooksK7C617CTK0MTNJVUJQ);
while(!looksK7C617CTK0MTNJVUJQ.canExecuteNow(provider,macro,looksEWESJZIGLPU3RGT1TXinstance,rawParamslooksK7C617CTK0MTNJVUJQ,paramslooksK7C617CTK0MTNJVUJQ)){}
IMacroAction doQXS1KTOCJ0WHE50MZ4instance = new FakeMacroAction();
do {
IMacroAction key1KEU8MLJJIM7MEL7M8instance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamskeyD9SD63XQ4W8U13A821 = "use";
String[] paramskeyD9SD63XQ4W8U13A821= "use".split("SPLIT");
IScriptAction keyD9SD63XQ4W8U13A821 = newInstance("key");
keyD9SD63XQ4W8U13A821.execute(provider,macro,key1KEU8MLJJIM7MEL7M8instance,rawParamskeyD9SD63XQ4W8U13A821,paramskeyD9SD63XQ4W8U13A821);
while(!keyD9SD63XQ4W8U13A821.canExecuteNow(provider,macro,key1KEU8MLJJIM7MEL7M8instance,rawParamskeyD9SD63XQ4W8U13A821,paramskeyD9SD63XQ4W8U13A821)){}
IMacroAction waitXXVEI82QZESI9OCVA4instance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamswaitPXEHG8SVJQN41RU4T3 = "1";
String[] paramswaitPXEHG8SVJQN41RU4T3= "1".split("SPLIT");
IScriptAction waitPXEHG8SVJQN41RU4T3 = newInstance("wait");
waitPXEHG8SVJQN41RU4T3.execute(provider,macro,waitXXVEI82QZESI9OCVA4instance,rawParamswaitPXEHG8SVJQN41RU4T3,paramswaitPXEHG8SVJQN41RU4T3);
while(!waitPXEHG8SVJQN41RU4T3.canExecuteNow(provider,macro,waitXXVEI82QZESI9OCVA4instance,rawParamswaitPXEHG8SVJQN41RU4T3,paramswaitPXEHG8SVJQN41RU4T3)){}
} while(provider.getExpressionEvaluator(macro,provider.expand(macro,"%gui%!=\"none\"",true)).evaluate() == 0);
IMacroAction waitMKQDTUR6XNDOFL2H7Vinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamswait4JA9F28BAG5BTMPLF5 = "200ms";
String[] paramswait4JA9F28BAG5BTMPLF5= "200ms".split("SPLIT");
IScriptAction wait4JA9F28BAG5BTMPLF5 = newInstance("wait");
wait4JA9F28BAG5BTMPLF5.execute(provider,macro,waitMKQDTUR6XNDOFL2H7Vinstance,rawParamswait4JA9F28BAG5BTMPLF5,paramswait4JA9F28BAG5BTMPLF5);
while(!wait4JA9F28BAG5BTMPLF5.canExecuteNow(provider,macro,waitMKQDTUR6XNDOFL2H7Vinstance,rawParamswait4JA9F28BAG5BTMPLF5,paramswait4JA9F28BAG5BTMPLF5)){}
IMacroAction slotclickGF04TJD353ST80OFS0instance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamsslotclickOH4AFIUFHMIWKAW5F5 = "12";
String[] paramsslotclickOH4AFIUFHMIWKAW5F5= "12".split("SPLIT");
IScriptAction slotclickOH4AFIUFHMIWKAW5F5 = newInstance("slotclick");
slotclickOH4AFIUFHMIWKAW5F5.execute(provider,macro,slotclickGF04TJD353ST80OFS0instance,rawParamsslotclickOH4AFIUFHMIWKAW5F5,paramsslotclickOH4AFIUFHMIWKAW5F5);
while(!slotclickOH4AFIUFHMIWKAW5F5.canExecuteNow(provider,macro,slotclickGF04TJD353ST80OFS0instance,rawParamsslotclickOH4AFIUFHMIWKAW5F5,paramsslotclickOH4AFIUFHMIWKAW5F5)){}
IMacroAction waitQFYXOIJEDQ36NE6K8Vinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamswaitL7N36UDIN4GVZYQWNN = "2";
String[] paramswaitL7N36UDIN4GVZYQWNN= "2".split("SPLIT");
IScriptAction waitL7N36UDIN4GVZYQWNN = newInstance("wait");
waitL7N36UDIN4GVZYQWNN.execute(provider,macro,waitQFYXOIJEDQ36NE6K8Vinstance,rawParamswaitL7N36UDIN4GVZYQWNN,paramswaitL7N36UDIN4GVZYQWNN);
while(!waitL7N36UDIN4GVZYQWNN.canExecuteNow(provider,macro,waitQFYXOIJEDQ36NE6K8Vinstance,rawParamswaitL7N36UDIN4GVZYQWNN,paramswaitL7N36UDIN4GVZYQWNN)){}
IMacroAction type4NFW0P4BQOQ38EHD0Uinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamstypePCSH4AXZXBO0EWWZ73 = "e";
String[] paramstypePCSH4AXZXBO0EWWZ73= "e".split("SPLIT");
IScriptAction typePCSH4AXZXBO0EWWZ73 = newInstance("type");
typePCSH4AXZXBO0EWWZ73.execute(provider,macro,type4NFW0P4BQOQ38EHD0Uinstance,rawParamstypePCSH4AXZXBO0EWWZ73,paramstypePCSH4AXZXBO0EWWZ73);
while(!typePCSH4AXZXBO0EWWZ73.canExecuteNow(provider,macro,type4NFW0P4BQOQ38EHD0Uinstance,rawParamstypePCSH4AXZXBO0EWWZ73,paramstypePCSH4AXZXBO0EWWZ73)){}
IMacroAction waitU3RJU4HCM26T44NO92instance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamswait3BCO0AIZUT6ACHZX6H = "10t";
String[] paramswait3BCO0AIZUT6ACHZX6H= "10t".split("SPLIT");
IScriptAction wait3BCO0AIZUT6ACHZX6H = newInstance("wait");
wait3BCO0AIZUT6ACHZX6H.execute(provider,macro,waitU3RJU4HCM26T44NO92instance,rawParamswait3BCO0AIZUT6ACHZX6H,paramswait3BCO0AIZUT6ACHZX6H);
while(!wait3BCO0AIZUT6ACHZX6H.canExecuteNow(provider,macro,waitU3RJU4HCM26T44NO92instance,rawParamswait3BCO0AIZUT6ACHZX6H,paramswait3BCO0AIZUT6ACHZX6H)){}
IMacroAction doPWFUMGK6L6YSE5YDX2instance = new FakeMacroAction();
do {
IMacroAction echoOZ9X2TCSU49KRI8HI2instance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamsechoEQUXM69AXMAC9F5A02 = "/craft";
String[] paramsechoEQUXM69AXMAC9F5A02= "/craft".split("SPLIT");
IScriptAction echoEQUXM69AXMAC9F5A02 = newInstance("echo");
echoEQUXM69AXMAC9F5A02.execute(provider,macro,echoOZ9X2TCSU49KRI8HI2instance,rawParamsechoEQUXM69AXMAC9F5A02,paramsechoEQUXM69AXMAC9F5A02);
while(!echoEQUXM69AXMAC9F5A02.canExecuteNow(provider,macro,echoOZ9X2TCSU49KRI8HI2instance,rawParamsechoEQUXM69AXMAC9F5A02,paramsechoEQUXM69AXMAC9F5A02)){}
IMacroAction waitHI8EEAEEWY3BIEC3P4instance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamswaitQTJBHDRI746FH6RZQN = "1";
String[] paramswaitQTJBHDRI746FH6RZQN= "1".split("SPLIT");
IScriptAction waitQTJBHDRI746FH6RZQN = newInstance("wait");
waitQTJBHDRI746FH6RZQN.execute(provider,macro,waitHI8EEAEEWY3BIEC3P4instance,rawParamswaitQTJBHDRI746FH6RZQN,paramswaitQTJBHDRI746FH6RZQN);
while(!waitQTJBHDRI746FH6RZQN.canExecuteNow(provider,macro,waitHI8EEAEEWY3BIEC3P4instance,rawParamswaitQTJBHDRI746FH6RZQN,paramswaitQTJBHDRI746FH6RZQN)){}
} while(provider.getExpressionEvaluator(macro,provider.expand(macro,"%gui%!=\"none\"",true)).evaluate() == 0);
IMacroAction waitYEEJ1MWPJSW2H7JTINinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamswaitIFGOVSGELJKMYRCF22 = "200ms";
String[] paramswaitIFGOVSGELJKMYRCF22= "200ms".split("SPLIT");
IScriptAction waitIFGOVSGELJKMYRCF22 = newInstance("wait");
waitIFGOVSGELJKMYRCF22.execute(provider,macro,waitYEEJ1MWPJSW2H7JTINinstance,rawParamswaitIFGOVSGELJKMYRCF22,paramswaitIFGOVSGELJKMYRCF22);
while(!waitIFGOVSGELJKMYRCF22.canExecuteNow(provider,macro,waitYEEJ1MWPJSW2H7JTINinstance,rawParamswaitIFGOVSGELJKMYRCF22,paramswaitIFGOVSGELJKMYRCF22)){}
IMacroAction forBEIVTRRKWAJKL27XVUinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamsforNH79U5344DRAG94VYZ = "#i 54 88";
String[] paramsforNH79U5344DRAG94VYZ= "#iSPLIT54SPLIT88".split("SPLIT");
IScriptAction forNH79U5344DRAG94VYZ = newInstance("for");
while(forNH79U5344DRAG94VYZ.executeStackPush(provider,macro,forBEIVTRRKWAJKL27XVUinstance,rawParamsforNH79U5344DRAG94VYZ,paramsforNH79U5344DRAG94VYZ)) {
IMacroAction getslotitemEB7JPG5JIFLKZHDO2Minstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamsgetslotitemTQPBXFMDMWEO4IXHGS = "%#i% &id #size";
String[] paramsgetslotitemTQPBXFMDMWEO4IXHGS= "%#i%SPLIT&idSPLIT#size".split("SPLIT");
IScriptAction getslotitemTQPBXFMDMWEO4IXHGS = newInstance("getslotitem");
getslotitemTQPBXFMDMWEO4IXHGS.execute(provider,macro,getslotitemEB7JPG5JIFLKZHDO2Minstance,rawParamsgetslotitemTQPBXFMDMWEO4IXHGS,paramsgetslotitemTQPBXFMDMWEO4IXHGS);
while(!getslotitemTQPBXFMDMWEO4IXHGS.canExecuteNow(provider,macro,getslotitemEB7JPG5JIFLKZHDO2Minstance,rawParamsgetslotitemTQPBXFMDMWEO4IXHGS,paramsgetslotitemTQPBXFMDMWEO4IXHGS)){}
if(provider.getExpressionEvaluator(macro,provider.expand(macro,"%&id% == \"stick\"",true)).evaluate() != 0) {
IMacroAction slotclickTFTCYGBXDGMMGW00PRinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamsslotclickU0OBBJANHYM1059RV2 = "%#i%";
String[] paramsslotclickU0OBBJANHYM1059RV2= "%#i%".split("SPLIT");
IScriptAction slotclickU0OBBJANHYM1059RV2 = newInstance("slotclick");
slotclickU0OBBJANHYM1059RV2.execute(provider,macro,slotclickTFTCYGBXDGMMGW00PRinstance,rawParamsslotclickU0OBBJANHYM1059RV2,paramsslotclickU0OBBJANHYM1059RV2);
while(!slotclickU0OBBJANHYM1059RV2.canExecuteNow(provider,macro,slotclickTFTCYGBXDGMMGW00PRinstance,rawParamsslotclickU0OBBJANHYM1059RV2,paramsslotclickU0OBBJANHYM1059RV2)){}
IMacroAction wait3B7W41D7N8E5O2LQRGinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamswaitP70FX0IDOZG56SBEZ7 = "500ms";
String[] paramswaitP70FX0IDOZG56SBEZ7= "500ms".split("SPLIT");
IScriptAction waitP70FX0IDOZG56SBEZ7 = newInstance("wait");
waitP70FX0IDOZG56SBEZ7.execute(provider,macro,wait3B7W41D7N8E5O2LQRGinstance,rawParamswaitP70FX0IDOZG56SBEZ7,paramswaitP70FX0IDOZG56SBEZ7);
while(!waitP70FX0IDOZG56SBEZ7.canExecuteNow(provider,macro,wait3B7W41D7N8E5O2LQRGinstance,rawParamswaitP70FX0IDOZG56SBEZ7,paramswaitP70FX0IDOZG56SBEZ7)){}
break;
}
}
IMacroAction slotclickAWW96T3ILWD4HCKOAQinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamsslotclickD8KW8EYIGE0Z63O9TS = "29";
String[] paramsslotclickD8KW8EYIGE0Z63O9TS= "29".split("SPLIT");
IScriptAction slotclickD8KW8EYIGE0Z63O9TS = newInstance("slotclick");
slotclickD8KW8EYIGE0Z63O9TS.execute(provider,macro,slotclickAWW96T3ILWD4HCKOAQinstance,rawParamsslotclickD8KW8EYIGE0Z63O9TS,paramsslotclickD8KW8EYIGE0Z63O9TS);
while(!slotclickD8KW8EYIGE0Z63O9TS.canExecuteNow(provider,macro,slotclickAWW96T3ILWD4HCKOAQinstance,rawParamsslotclickD8KW8EYIGE0Z63O9TS,paramsslotclickD8KW8EYIGE0Z63O9TS)){}
IMacroAction wait6E30MZA0HX3GDTQLGZinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamswait08TA8U48GYHB9BUCYO = "8t";
String[] paramswait08TA8U48GYHB9BUCYO= "8t".split("SPLIT");
IScriptAction wait08TA8U48GYHB9BUCYO = newInstance("wait");
wait08TA8U48GYHB9BUCYO.execute(provider,macro,wait6E30MZA0HX3GDTQLGZinstance,rawParamswait08TA8U48GYHB9BUCYO,paramswait08TA8U48GYHB9BUCYO);
while(!wait08TA8U48GYHB9BUCYO.canExecuteNow(provider,macro,wait6E30MZA0HX3GDTQLGZinstance,rawParamswait08TA8U48GYHB9BUCYO,paramswait08TA8U48GYHB9BUCYO)){}
IMacroAction slotclick2R1FT4YPD7U8P93YKJinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamsslotclickTN77LCZVXYOK5XE1L0 = "29 right false";
String[] paramsslotclickTN77LCZVXYOK5XE1L0= "29SPLITrightSPLITfalse".split("SPLIT");
IScriptAction slotclickTN77LCZVXYOK5XE1L0 = newInstance("slotclick");
slotclickTN77LCZVXYOK5XE1L0.execute(provider,macro,slotclick2R1FT4YPD7U8P93YKJinstance,rawParamsslotclickTN77LCZVXYOK5XE1L0,paramsslotclickTN77LCZVXYOK5XE1L0);
while(!slotclickTN77LCZVXYOK5XE1L0.canExecuteNow(provider,macro,slotclick2R1FT4YPD7U8P93YKJinstance,rawParamsslotclickTN77LCZVXYOK5XE1L0,paramsslotclickTN77LCZVXYOK5XE1L0)){}
IMacroAction waitFX8WXYNJ4P5K1R6HYNinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamswait4MHR11SMM0TTLNPZT5 = "8t";
String[] paramswait4MHR11SMM0TTLNPZT5= "8t".split("SPLIT");
IScriptAction wait4MHR11SMM0TTLNPZT5 = newInstance("wait");
wait4MHR11SMM0TTLNPZT5.execute(provider,macro,waitFX8WXYNJ4P5K1R6HYNinstance,rawParamswait4MHR11SMM0TTLNPZT5,paramswait4MHR11SMM0TTLNPZT5);
while(!wait4MHR11SMM0TTLNPZT5.canExecuteNow(provider,macro,waitFX8WXYNJ4P5K1R6HYNinstance,rawParamswait4MHR11SMM0TTLNPZT5,paramswait4MHR11SMM0TTLNPZT5)){}
IMacroAction slotclick2WVJDRBQSRP5MIIRANinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamsslotclickQN8C3HLJ8NCJ4YN43J = "20";
String[] paramsslotclickQN8C3HLJ8NCJ4YN43J= "20".split("SPLIT");
IScriptAction slotclickQN8C3HLJ8NCJ4YN43J = newInstance("slotclick");
slotclickQN8C3HLJ8NCJ4YN43J.execute(provider,macro,slotclick2WVJDRBQSRP5MIIRANinstance,rawParamsslotclickQN8C3HLJ8NCJ4YN43J,paramsslotclickQN8C3HLJ8NCJ4YN43J);
while(!slotclickQN8C3HLJ8NCJ4YN43J.canExecuteNow(provider,macro,slotclick2WVJDRBQSRP5MIIRANinstance,rawParamsslotclickQN8C3HLJ8NCJ4YN43J,paramsslotclickQN8C3HLJ8NCJ4YN43J)){}
IMacroAction wait0DMWHSB3RKVBEJMS8Yinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamswait7PJSXTK7I4K912TY1Z = "8t";
String[] paramswait7PJSXTK7I4K912TY1Z= "8t".split("SPLIT");
IScriptAction wait7PJSXTK7I4K912TY1Z = newInstance("wait");
wait7PJSXTK7I4K912TY1Z.execute(provider,macro,wait0DMWHSB3RKVBEJMS8Yinstance,rawParamswait7PJSXTK7I4K912TY1Z,paramswait7PJSXTK7I4K912TY1Z);
while(!wait7PJSXTK7I4K912TY1Z.canExecuteNow(provider,macro,wait0DMWHSB3RKVBEJMS8Yinstance,rawParamswait7PJSXTK7I4K912TY1Z,paramswait7PJSXTK7I4K912TY1Z)){}
IMacroAction forRZURA1OJBV6H7VNMXVinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamsforT9AHD61415U4Z0AZZL = "#i 54 88";
String[] paramsforT9AHD61415U4Z0AZZL= "#iSPLIT54SPLIT88".split("SPLIT");
IScriptAction forT9AHD61415U4Z0AZZL = newInstance("for");
while(forT9AHD61415U4Z0AZZL.executeStackPush(provider,macro,forRZURA1OJBV6H7VNMXVinstance,rawParamsforT9AHD61415U4Z0AZZL,paramsforT9AHD61415U4Z0AZZL)) {
IMacroAction getslotitemPO08PMOXOSJ1TLY7FTinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamsgetslotitemHDIXADPVLAXZO8R73C = "%#i% &id #size";
String[] paramsgetslotitemHDIXADPVLAXZO8R73C= "%#i%SPLIT&idSPLIT#size".split("SPLIT");
IScriptAction getslotitemHDIXADPVLAXZO8R73C = newInstance("getslotitem");
getslotitemHDIXADPVLAXZO8R73C.execute(provider,macro,getslotitemPO08PMOXOSJ1TLY7FTinstance,rawParamsgetslotitemHDIXADPVLAXZO8R73C,paramsgetslotitemHDIXADPVLAXZO8R73C);
while(!getslotitemHDIXADPVLAXZO8R73C.canExecuteNow(provider,macro,getslotitemPO08PMOXOSJ1TLY7FTinstance,rawParamsgetslotitemHDIXADPVLAXZO8R73C,paramsgetslotitemHDIXADPVLAXZO8R73C)){}
if(provider.getExpressionEvaluator(macro,provider.expand(macro,"%&id% == \"gold_ingot\"",true)).evaluate() != 0) {
IMacroAction slotclickPWKSDZ5R7CJYVPQ6G2instance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamsslotclickMBMJKR1LV3FBQRAK5S = "%#i%";
String[] paramsslotclickMBMJKR1LV3FBQRAK5S= "%#i%".split("SPLIT");
IScriptAction slotclickMBMJKR1LV3FBQRAK5S = newInstance("slotclick");
slotclickMBMJKR1LV3FBQRAK5S.execute(provider,macro,slotclickPWKSDZ5R7CJYVPQ6G2instance,rawParamsslotclickMBMJKR1LV3FBQRAK5S,paramsslotclickMBMJKR1LV3FBQRAK5S);
while(!slotclickMBMJKR1LV3FBQRAK5S.canExecuteNow(provider,macro,slotclickPWKSDZ5R7CJYVPQ6G2instance,rawParamsslotclickMBMJKR1LV3FBQRAK5S,paramsslotclickMBMJKR1LV3FBQRAK5S)){}
IMacroAction waitTGXTGC7UYI6L0FFXP4instance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamswaitZZ03AAEU2J6ZFXHA0T = "500ms";
String[] paramswaitZZ03AAEU2J6ZFXHA0T= "500ms".split("SPLIT");
IScriptAction waitZZ03AAEU2J6ZFXHA0T = newInstance("wait");
waitZZ03AAEU2J6ZFXHA0T.execute(provider,macro,waitTGXTGC7UYI6L0FFXP4instance,rawParamswaitZZ03AAEU2J6ZFXHA0T,paramswaitZZ03AAEU2J6ZFXHA0T);
while(!waitZZ03AAEU2J6ZFXHA0T.canExecuteNow(provider,macro,waitTGXTGC7UYI6L0FFXP4instance,rawParamswaitZZ03AAEU2J6ZFXHA0T,paramswaitZZ03AAEU2J6ZFXHA0T)){}
break;
}
}
IMacroAction slotclickGUAG8BJ2GX9SB16BC2instance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamsslotclickZH4MKAC3K4AJQMI3MO = "11";
String[] paramsslotclickZH4MKAC3K4AJQMI3MO= "11".split("SPLIT");
IScriptAction slotclickZH4MKAC3K4AJQMI3MO = newInstance("slotclick");
slotclickZH4MKAC3K4AJQMI3MO.execute(provider,macro,slotclickGUAG8BJ2GX9SB16BC2instance,rawParamsslotclickZH4MKAC3K4AJQMI3MO,paramsslotclickZH4MKAC3K4AJQMI3MO);
while(!slotclickZH4MKAC3K4AJQMI3MO.canExecuteNow(provider,macro,slotclickGUAG8BJ2GX9SB16BC2instance,rawParamsslotclickZH4MKAC3K4AJQMI3MO,paramsslotclickZH4MKAC3K4AJQMI3MO)){}
IMacroAction wait5MZBV1R1F8MP4X3G75instance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamswaitTKZXK5JB9OQW1UB45J = "2";
String[] paramswaitTKZXK5JB9OQW1UB45J= "2".split("SPLIT");
IScriptAction waitTKZXK5JB9OQW1UB45J = newInstance("wait");
waitTKZXK5JB9OQW1UB45J.execute(provider,macro,wait5MZBV1R1F8MP4X3G75instance,rawParamswaitTKZXK5JB9OQW1UB45J,paramswaitTKZXK5JB9OQW1UB45J);
while(!waitTKZXK5JB9OQW1UB45J.canExecuteNow(provider,macro,wait5MZBV1R1F8MP4X3G75instance,rawParamswaitTKZXK5JB9OQW1UB45J,paramswaitTKZXK5JB9OQW1UB45J)){}
IMacroAction slotclickGN5U4MXRHZKL5QJKCRinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamsslotclickHPDE5YS3BUDMU50T9T = "23 left true";
String[] paramsslotclickHPDE5YS3BUDMU50T9T= "23SPLITleftSPLITtrue".split("SPLIT");
IScriptAction slotclickHPDE5YS3BUDMU50T9T = newInstance("slotclick");
slotclickHPDE5YS3BUDMU50T9T.execute(provider,macro,slotclickGN5U4MXRHZKL5QJKCRinstance,rawParamsslotclickHPDE5YS3BUDMU50T9T,paramsslotclickHPDE5YS3BUDMU50T9T);
while(!slotclickHPDE5YS3BUDMU50T9T.canExecuteNow(provider,macro,slotclickGN5U4MXRHZKL5QJKCRinstance,rawParamsslotclickHPDE5YS3BUDMU50T9T,paramsslotclickHPDE5YS3BUDMU50T9T)){}
IMacroAction waitB2EI188D58QPRA1WXDinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamswaitE24R5LVD7D3HY63MNX = "2";
String[] paramswaitE24R5LVD7D3HY63MNX= "2".split("SPLIT");
IScriptAction waitE24R5LVD7D3HY63MNX = newInstance("wait");
waitE24R5LVD7D3HY63MNX.execute(provider,macro,waitB2EI188D58QPRA1WXDinstance,rawParamswaitE24R5LVD7D3HY63MNX,paramswaitE24R5LVD7D3HY63MNX);
while(!waitE24R5LVD7D3HY63MNX.canExecuteNow(provider,macro,waitB2EI188D58QPRA1WXDinstance,rawParamswaitE24R5LVD7D3HY63MNX,paramswaitE24R5LVD7D3HY63MNX)){}
IMacroAction typeAL7Z9GA422F5VTMZJSinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamstypeOM68LYL2IR3I9MNFQA = "e";
String[] paramstypeOM68LYL2IR3I9MNFQA= "e".split("SPLIT");
IScriptAction typeOM68LYL2IR3I9MNFQA = newInstance("type");
typeOM68LYL2IR3I9MNFQA.execute(provider,macro,typeAL7Z9GA422F5VTMZJSinstance,rawParamstypeOM68LYL2IR3I9MNFQA,paramstypeOM68LYL2IR3I9MNFQA);
while(!typeOM68LYL2IR3I9MNFQA.canExecuteNow(provider,macro,typeAL7Z9GA422F5VTMZJSinstance,rawParamstypeOM68LYL2IR3I9MNFQA,paramstypeOM68LYL2IR3I9MNFQA)){}
IMacroAction waitV6J3O4918HN7HJXAV1instance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamswaitJQNFLB2ZZLRNNDEB8C = "5";
String[] paramswaitJQNFLB2ZZLRNNDEB8C= "5".split("SPLIT");
IScriptAction waitJQNFLB2ZZLRNNDEB8C = newInstance("wait");
waitJQNFLB2ZZLRNNDEB8C.execute(provider,macro,waitV6J3O4918HN7HJXAV1instance,rawParamswaitJQNFLB2ZZLRNNDEB8C,paramswaitJQNFLB2ZZLRNNDEB8C);
while(!waitJQNFLB2ZZLRNNDEB8C.canExecuteNow(provider,macro,waitV6J3O4918HN7HJXAV1instance,rawParamswaitJQNFLB2ZZLRNNDEB8C,paramswaitJQNFLB2ZZLRNNDEB8C)){}
} else {
if(provider.getExpressionEvaluator(macro,provider.expand(macro,"telekines == \"32\"",true)).evaluate() != 0) {
IMacroAction assignF8NGZF9AYDBVMV11J8instance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamsassignFRV7YM99UEEH9M6PPB = "-37";
String[] paramsassignFRV7YM99UEEH9M6PPB= "#xSPLIT-37".split("SPLIT");
IScriptAction assignFRV7YM99UEEH9M6PPB = newInstance("assign");
assignFRV7YM99UEEH9M6PPB.execute(provider,macro,assignF8NGZF9AYDBVMV11J8instance,rawParamsassignFRV7YM99UEEH9M6PPB,paramsassignFRV7YM99UEEH9M6PPB);
while(!assignFRV7YM99UEEH9M6PPB.canExecuteNow(provider,macro,assignF8NGZF9AYDBVMV11J8instance,rawParamsassignFRV7YM99UEEH9M6PPB,paramsassignFRV7YM99UEEH9M6PPB)){}
IMacroAction assignDTEJB56Z0W703PLYRGinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamsassignR8TCLH3HWHZ0VE4L9V = "-114";
String[] paramsassignR8TCLH3HWHZ0VE4L9V= "#zSPLIT-114".split("SPLIT");
IScriptAction assignR8TCLH3HWHZ0VE4L9V = newInstance("assign");
assignR8TCLH3HWHZ0VE4L9V.execute(provider,macro,assignDTEJB56Z0W703PLYRGinstance,rawParamsassignR8TCLH3HWHZ0VE4L9V,paramsassignR8TCLH3HWHZ0VE4L9V);
while(!assignR8TCLH3HWHZ0VE4L9V.canExecuteNow(provider,macro,assignDTEJB56Z0W703PLYRGinstance,rawParamsassignR8TCLH3HWHZ0VE4L9V,paramsassignR8TCLH3HWHZ0VE4L9V)){}
IMacroAction doLPY0LTQ11ADJJ1Q0WIinstance = new FakeMacroAction();
do {
IMacroAction calcyawtoPU1K1PCS4Z5SKCDWSLinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamscalcyawtoQB4KNA28M23HVE4NOU = "-35.5 70 -112.5 #yaw #pitch #dist";
String[] paramscalcyawtoQB4KNA28M23HVE4NOU= "-35.5SPLIT70SPLIT-112.5SPLIT#yawSPLIT#pitchSPLIT#dist".split("SPLIT");
IScriptAction calcyawtoQB4KNA28M23HVE4NOU = newInstance("calcyawto");
calcyawtoQB4KNA28M23HVE4NOU.execute(provider,macro,calcyawtoPU1K1PCS4Z5SKCDWSLinstance,rawParamscalcyawtoQB4KNA28M23HVE4NOU,paramscalcyawtoQB4KNA28M23HVE4NOU);
while(!calcyawtoQB4KNA28M23HVE4NOU.canExecuteNow(provider,macro,calcyawtoPU1K1PCS4Z5SKCDWSLinstance,rawParamscalcyawtoQB4KNA28M23HVE4NOU,paramscalcyawtoQB4KNA28M23HVE4NOU)){}
IMacroAction assignOOOKJPRJ5RAMBV23G2instance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamsassignS45AUZADCFQREEPOYS = "%#yaw% + 180";
String[] paramsassignS45AUZADCFQREEPOYS= "#yawSPLIT%#yaw% + 180".split("SPLIT");
IScriptAction assignS45AUZADCFQREEPOYS = newInstance("assign");
assignS45AUZADCFQREEPOYS.execute(provider,macro,assignOOOKJPRJ5RAMBV23G2instance,rawParamsassignS45AUZADCFQREEPOYS,paramsassignS45AUZADCFQREEPOYS);
while(!assignS45AUZADCFQREEPOYS.canExecuteNow(provider,macro,assignOOOKJPRJ5RAMBV23G2instance,rawParamsassignS45AUZADCFQREEPOYS,paramsassignS45AUZADCFQREEPOYS)){}
IMacroAction gotoEE4O9RY0CBQQZRM36Kinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamsgotoDSXXBW9Z070IL0X9SN = "%#x%  %#z%";
String[] paramsgotoDSXXBW9Z070IL0X9SN= "%#x%SPLITSPLIT%#z%".split("SPLIT");
IScriptAction gotoDSXXBW9Z070IL0X9SN = newInstance("goto");
gotoDSXXBW9Z070IL0X9SN.execute(provider,macro,gotoEE4O9RY0CBQQZRM36Kinstance,rawParamsgotoDSXXBW9Z070IL0X9SN,paramsgotoDSXXBW9Z070IL0X9SN);
while(!gotoDSXXBW9Z070IL0X9SN.canExecuteNow(provider,macro,gotoEE4O9RY0CBQQZRM36Kinstance,rawParamsgotoDSXXBW9Z070IL0X9SN,paramsgotoDSXXBW9Z070IL0X9SN)){}
IMacroAction looksZ3QYUP67CSHNZ3VKJNinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamslooks0KNANNERD0ZOYKMARA = "%#yaw% 0 0.5";
String[] paramslooks0KNANNERD0ZOYKMARA= "%#yaw%SPLIT0SPLIT0.5".split("SPLIT");
IScriptAction looks0KNANNERD0ZOYKMARA = newInstance("looks");
looks0KNANNERD0ZOYKMARA.execute(provider,macro,looksZ3QYUP67CSHNZ3VKJNinstance,rawParamslooks0KNANNERD0ZOYKMARA,paramslooks0KNANNERD0ZOYKMARA);
while(!looks0KNANNERD0ZOYKMARA.canExecuteNow(provider,macro,looksZ3QYUP67CSHNZ3VKJNinstance,rawParamslooks0KNANNERD0ZOYKMARA,paramslooks0KNANNERD0ZOYKMARA)){}
} while(provider.getExpressionEvaluator(macro,provider.expand(macro,"(xpos==%#x%)&&(zpos==%#z%)",true)).evaluate() == 0);
if(provider.getExpressionEvaluator(macro,provider.expand(macro,"%level% < 5",true)).evaluate() != 0) {
setActionsCurrentTickMax(100);
IMacroAction assignMO86PY4WMH3DTGXB6Cinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamsassignYOEPYFM8KMTXAFBRNE = "0";
String[] paramsassignYOEPYFM8KMTXAFBRNE= "#bottleSPLIT0".split("SPLIT");
IScriptAction assignYOEPYFM8KMTXAFBRNE = newInstance("assign");
assignYOEPYFM8KMTXAFBRNE.execute(provider,macro,assignMO86PY4WMH3DTGXB6Cinstance,rawParamsassignYOEPYFM8KMTXAFBRNE,paramsassignYOEPYFM8KMTXAFBRNE);
while(!assignYOEPYFM8KMTXAFBRNE.canExecuteNow(provider,macro,assignMO86PY4WMH3DTGXB6Cinstance,rawParamsassignYOEPYFM8KMTXAFBRNE,paramsassignYOEPYFM8KMTXAFBRNE)){}
IMacroAction for5Z9XCUN6Z4R2MZEJIAinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamsforQT90EJHTJX5VRXSCI5 = "#i = 37 to 43 step 1";
String[] paramsforQT90EJHTJX5VRXSCI5= "#i = 37 to 43 step 1".split("SPLIT");
IScriptAction forQT90EJHTJX5VRXSCI5 = newInstance("for");
while(forQT90EJHTJX5VRXSCI5.executeStackPush(provider,macro,for5Z9XCUN6Z4R2MZEJIAinstance,rawParamsforQT90EJHTJX5VRXSCI5,paramsforQT90EJHTJX5VRXSCI5)) {
IMacroAction getslotiteminvF0HB9K52N84AAN1MJMinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamsgetslotiteminvNZ9398ZQUTZTZXDT03 = "%#i% &id #stacksize #data &nbt";
String[] paramsgetslotiteminvNZ9398ZQUTZTZXDT03= "%#i%SPLIT&idSPLIT#stacksizeSPLIT#dataSPLIT&nbt".split("SPLIT");
IScriptAction getslotiteminvNZ9398ZQUTZTZXDT03 = newInstance("getslotiteminv");
getslotiteminvNZ9398ZQUTZTZXDT03.execute(provider,macro,getslotiteminvF0HB9K52N84AAN1MJMinstance,rawParamsgetslotiteminvNZ9398ZQUTZTZXDT03,paramsgetslotiteminvNZ9398ZQUTZTZXDT03);
while(!getslotiteminvNZ9398ZQUTZTZXDT03.canExecuteNow(provider,macro,getslotiteminvF0HB9K52N84AAN1MJMinstance,rawParamsgetslotiteminvNZ9398ZQUTZTZXDT03,paramsgetslotiteminvNZ9398ZQUTZTZXDT03)){}
IMacroAction ifcontains4KNG0OHSQ4SBZCV4J5instance = new FakeMacroAction();
String rawParamsifcontainsPZW454XQR90WNP0KHF = "%&id% bottle";
String[] paramsifcontainsPZW454XQR90WNP0KHF= "%&id%SPLITbottle".split("SPLIT");
IScriptAction ifcontainsPZW454XQR90WNP0KHF = newInstance("ifcontains");
if(ifcontainsPZW454XQR90WNP0KHF.executeConditional(provider,macro,ifcontains4KNG0OHSQ4SBZCV4J5instance,rawParamsifcontainsPZW454XQR90WNP0KHF,paramsifcontainsPZW454XQR90WNP0KHF)) {
IMacroAction incMNT9DXAHN4DR0UR1VFinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamsincFUTJTI9YMC1NFLBZZY = "#bottle %#stacksize%";
String[] paramsincFUTJTI9YMC1NFLBZZY= "#bottleSPLIT%#stacksize%".split("SPLIT");
IScriptAction incFUTJTI9YMC1NFLBZZY = newInstance("inc");
incFUTJTI9YMC1NFLBZZY.execute(provider,macro,incMNT9DXAHN4DR0UR1VFinstance,rawParamsincFUTJTI9YMC1NFLBZZY,paramsincFUTJTI9YMC1NFLBZZY);
while(!incFUTJTI9YMC1NFLBZZY.canExecuteNow(provider,macro,incMNT9DXAHN4DR0UR1VFinstance,rawParamsincFUTJTI9YMC1NFLBZZY,paramsincFUTJTI9YMC1NFLBZZY)){}
}
}
setActionsCurrentTickMax(100);
if(provider.getExpressionEvaluator(macro,provider.expand(macro,"#bottle < 8",true)).evaluate() != 0) {
IMacroAction calcyawtoLKKYV6LW3DOYC5R1CAinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamscalcyawto6X66E7OTVIHI4LHLQM = "-35.5 70 -112.5 #yaw #pitch #dist";
String[] paramscalcyawto6X66E7OTVIHI4LHLQM= "-35.5SPLIT70SPLIT-112.5SPLIT#yawSPLIT#pitchSPLIT#dist".split("SPLIT");
IScriptAction calcyawto6X66E7OTVIHI4LHLQM = newInstance("calcyawto");
calcyawto6X66E7OTVIHI4LHLQM.execute(provider,macro,calcyawtoLKKYV6LW3DOYC5R1CAinstance,rawParamscalcyawto6X66E7OTVIHI4LHLQM,paramscalcyawto6X66E7OTVIHI4LHLQM);
while(!calcyawto6X66E7OTVIHI4LHLQM.canExecuteNow(provider,macro,calcyawtoLKKYV6LW3DOYC5R1CAinstance,rawParamscalcyawto6X66E7OTVIHI4LHLQM,paramscalcyawto6X66E7OTVIHI4LHLQM)){}
IMacroAction assign8LQGJK9AQXVX0LM65Ainstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamsassignG5MDS0K2G8LZ0PBFXX = "%#yaw% + 180";
String[] paramsassignG5MDS0K2G8LZ0PBFXX= "#yawSPLIT%#yaw% + 180".split("SPLIT");
IScriptAction assignG5MDS0K2G8LZ0PBFXX = newInstance("assign");
assignG5MDS0K2G8LZ0PBFXX.execute(provider,macro,assign8LQGJK9AQXVX0LM65Ainstance,rawParamsassignG5MDS0K2G8LZ0PBFXX,paramsassignG5MDS0K2G8LZ0PBFXX);
while(!assignG5MDS0K2G8LZ0PBFXX.canExecuteNow(provider,macro,assign8LQGJK9AQXVX0LM65Ainstance,rawParamsassignG5MDS0K2G8LZ0PBFXX,paramsassignG5MDS0K2G8LZ0PBFXX)){}
IMacroAction looksH8HE6NDN2RJVWXD6AHinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamslooksT5ZWAK45AS2QXJGAF3 = "%#yaw% 0 0.5";
String[] paramslooksT5ZWAK45AS2QXJGAF3= "%#yaw%SPLIT0SPLIT0.5".split("SPLIT");
IScriptAction looksT5ZWAK45AS2QXJGAF3 = newInstance("looks");
looksT5ZWAK45AS2QXJGAF3.execute(provider,macro,looksH8HE6NDN2RJVWXD6AHinstance,rawParamslooksT5ZWAK45AS2QXJGAF3,paramslooksT5ZWAK45AS2QXJGAF3);
while(!looksT5ZWAK45AS2QXJGAF3.canExecuteNow(provider,macro,looksH8HE6NDN2RJVWXD6AHinstance,rawParamslooksT5ZWAK45AS2QXJGAF3,paramslooksT5ZWAK45AS2QXJGAF3)){}
IMacroAction doXYG7UWGOOM7A1G7XHKinstance = new FakeMacroAction();
do {
IMacroAction key9K4Q4X3V0Z7Q05K8YWinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamskeyZ1AA0AZPL3BQE9XXB9 = "use";
String[] paramskeyZ1AA0AZPL3BQE9XXB9= "use".split("SPLIT");
IScriptAction keyZ1AA0AZPL3BQE9XXB9 = newInstance("key");
keyZ1AA0AZPL3BQE9XXB9.execute(provider,macro,key9K4Q4X3V0Z7Q05K8YWinstance,rawParamskeyZ1AA0AZPL3BQE9XXB9,paramskeyZ1AA0AZPL3BQE9XXB9);
while(!keyZ1AA0AZPL3BQE9XXB9.canExecuteNow(provider,macro,key9K4Q4X3V0Z7Q05K8YWinstance,rawParamskeyZ1AA0AZPL3BQE9XXB9,paramskeyZ1AA0AZPL3BQE9XXB9)){}
IMacroAction waitARY1SZLWHLDNAJRFTSinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamswaitZCBO55G240KJOQVZ3I = "1";
String[] paramswaitZCBO55G240KJOQVZ3I= "1".split("SPLIT");
IScriptAction waitZCBO55G240KJOQVZ3I = newInstance("wait");
waitZCBO55G240KJOQVZ3I.execute(provider,macro,waitARY1SZLWHLDNAJRFTSinstance,rawParamswaitZCBO55G240KJOQVZ3I,paramswaitZCBO55G240KJOQVZ3I);
while(!waitZCBO55G240KJOQVZ3I.canExecuteNow(provider,macro,waitARY1SZLWHLDNAJRFTSinstance,rawParamswaitZCBO55G240KJOQVZ3I,paramswaitZCBO55G240KJOQVZ3I)){}
} while(provider.getExpressionEvaluator(macro,provider.expand(macro,"%gui%!=\"none\"",true)).evaluate() == 0);
IMacroAction wait2A3VKM8N68EUHI4HMLinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamswaitSYBVMRT4G8JD0YUPVJ = "200ms";
String[] paramswaitSYBVMRT4G8JD0YUPVJ= "200ms".split("SPLIT");
IScriptAction waitSYBVMRT4G8JD0YUPVJ = newInstance("wait");
waitSYBVMRT4G8JD0YUPVJ.execute(provider,macro,wait2A3VKM8N68EUHI4HMLinstance,rawParamswaitSYBVMRT4G8JD0YUPVJ,paramswaitSYBVMRT4G8JD0YUPVJ);
while(!waitSYBVMRT4G8JD0YUPVJ.canExecuteNow(provider,macro,wait2A3VKM8N68EUHI4HMLinstance,rawParamswaitSYBVMRT4G8JD0YUPVJ,paramswaitSYBVMRT4G8JD0YUPVJ)){}
IMacroAction forZ6RIZIMX5YCXBOARFYinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamsforIZRDOQECVIX9GH2CEG = "#i 54 88";
String[] paramsforIZRDOQECVIX9GH2CEG= "#iSPLIT54SPLIT88".split("SPLIT");
IScriptAction forIZRDOQECVIX9GH2CEG = newInstance("for");
while(forIZRDOQECVIX9GH2CEG.executeStackPush(provider,macro,forZ6RIZIMX5YCXBOARFYinstance,rawParamsforIZRDOQECVIX9GH2CEG,paramsforIZRDOQECVIX9GH2CEG)) {
IMacroAction getslotitemNVW8WN821IQ2SMBXN1instance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamsgetslotitemBKZN0WUTA03V51289P = "%#i% &id #size";
String[] paramsgetslotitemBKZN0WUTA03V51289P= "%#i%SPLIT&idSPLIT#size".split("SPLIT");
IScriptAction getslotitemBKZN0WUTA03V51289P = newInstance("getslotitem");
getslotitemBKZN0WUTA03V51289P.execute(provider,macro,getslotitemNVW8WN821IQ2SMBXN1instance,rawParamsgetslotitemBKZN0WUTA03V51289P,paramsgetslotitemBKZN0WUTA03V51289P);
while(!getslotitemBKZN0WUTA03V51289P.canExecuteNow(provider,macro,getslotitemNVW8WN821IQ2SMBXN1instance,rawParamsgetslotitemBKZN0WUTA03V51289P,paramsgetslotitemBKZN0WUTA03V51289P)){}
if(provider.getExpressionEvaluator(macro,provider.expand(macro,"%&id% == \"golden_shovel\"",true)).evaluate() != 0) {
} else if(provider.getExpressionEvaluator(macro,provider.expand(macro,"%&id% == \"experience_bottle\"",false)).evaluate() != 0) {
} else if(provider.getExpressionEvaluator(macro,provider.expand(macro,"%&id% != \"air\"",false)).evaluate() != 0) {
IMacroAction slotclickS2TYGCYT85PSE6M9VVinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamsslotclickORTAZS8VY8RHCRM7IU = "%#i% right true";
String[] paramsslotclickORTAZS8VY8RHCRM7IU= "%#i%SPLITrightSPLITtrue".split("SPLIT");
IScriptAction slotclickORTAZS8VY8RHCRM7IU = newInstance("slotclick");
slotclickORTAZS8VY8RHCRM7IU.execute(provider,macro,slotclickS2TYGCYT85PSE6M9VVinstance,rawParamsslotclickORTAZS8VY8RHCRM7IU,paramsslotclickORTAZS8VY8RHCRM7IU);
while(!slotclickORTAZS8VY8RHCRM7IU.canExecuteNow(provider,macro,slotclickS2TYGCYT85PSE6M9VVinstance,rawParamsslotclickORTAZS8VY8RHCRM7IU,paramsslotclickORTAZS8VY8RHCRM7IU)){}
IMacroAction waitWNUBMB1MZ5XO0X06Y3instance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamswaitS8O8Z90QD5CZDMYJU8 = "500ms";
String[] paramswaitS8O8Z90QD5CZDMYJU8= "500ms".split("SPLIT");
IScriptAction waitS8O8Z90QD5CZDMYJU8 = newInstance("wait");
waitS8O8Z90QD5CZDMYJU8.execute(provider,macro,waitWNUBMB1MZ5XO0X06Y3instance,rawParamswaitS8O8Z90QD5CZDMYJU8,paramswaitS8O8Z90QD5CZDMYJU8);
while(!waitS8O8Z90QD5CZDMYJU8.canExecuteNow(provider,macro,waitWNUBMB1MZ5XO0X06Y3instance,rawParamswaitS8O8Z90QD5CZDMYJU8,paramswaitS8O8Z90QD5CZDMYJU8)){}
}
}
IMacroAction slotclickWXTJ429AVPOI64AO9Uinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamsslotclick7WJLM889R7G85HG63B = "10 right false";
String[] paramsslotclick7WJLM889R7G85HG63B= "10SPLITrightSPLITfalse".split("SPLIT");
IScriptAction slotclick7WJLM889R7G85HG63B = newInstance("slotclick");
slotclick7WJLM889R7G85HG63B.execute(provider,macro,slotclickWXTJ429AVPOI64AO9Uinstance,rawParamsslotclick7WJLM889R7G85HG63B,paramsslotclick7WJLM889R7G85HG63B);
while(!slotclick7WJLM889R7G85HG63B.canExecuteNow(provider,macro,slotclickWXTJ429AVPOI64AO9Uinstance,rawParamsslotclick7WJLM889R7G85HG63B,paramsslotclick7WJLM889R7G85HG63B)){}
IMacroAction waitGKUCBZ84AW705KB451instance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamswaitGJQHFUPLIOUOWD95CY = "15t";
String[] paramswaitGJQHFUPLIOUOWD95CY= "15t".split("SPLIT");
IScriptAction waitGJQHFUPLIOUOWD95CY = newInstance("wait");
waitGJQHFUPLIOUOWD95CY.execute(provider,macro,waitGKUCBZ84AW705KB451instance,rawParamswaitGJQHFUPLIOUOWD95CY,paramswaitGJQHFUPLIOUOWD95CY);
while(!waitGJQHFUPLIOUOWD95CY.canExecuteNow(provider,macro,waitGKUCBZ84AW705KB451instance,rawParamswaitGJQHFUPLIOUOWD95CY,paramswaitGJQHFUPLIOUOWD95CY)){}
IMacroAction slotclickRYM22OUPYDZP7GFLNKinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamsslotclickLI1L9OO6VJ9WMZMT4X = "22";
String[] paramsslotclickLI1L9OO6VJ9WMZMT4X= "22".split("SPLIT");
IScriptAction slotclickLI1L9OO6VJ9WMZMT4X = newInstance("slotclick");
slotclickLI1L9OO6VJ9WMZMT4X.execute(provider,macro,slotclickRYM22OUPYDZP7GFLNKinstance,rawParamsslotclickLI1L9OO6VJ9WMZMT4X,paramsslotclickLI1L9OO6VJ9WMZMT4X);
while(!slotclickLI1L9OO6VJ9WMZMT4X.canExecuteNow(provider,macro,slotclickRYM22OUPYDZP7GFLNKinstance,rawParamsslotclickLI1L9OO6VJ9WMZMT4X,paramsslotclickLI1L9OO6VJ9WMZMT4X)){}
IMacroAction wait3TQLVK35DNT4MZQ8CQinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamswaitE526AEWE1B0XN44OOY = "15t";
String[] paramswaitE526AEWE1B0XN44OOY= "15t".split("SPLIT");
IScriptAction waitE526AEWE1B0XN44OOY = newInstance("wait");
waitE526AEWE1B0XN44OOY.execute(provider,macro,wait3TQLVK35DNT4MZQ8CQinstance,rawParamswaitE526AEWE1B0XN44OOY,paramswaitE526AEWE1B0XN44OOY);
while(!waitE526AEWE1B0XN44OOY.canExecuteNow(provider,macro,wait3TQLVK35DNT4MZQ8CQinstance,rawParamswaitE526AEWE1B0XN44OOY,paramswaitE526AEWE1B0XN44OOY)){}
IMacroAction pressHBVQT1XSC01B11WC5Einstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamspressMH4BY7JUT4X2Y12D07 = "e";
String[] paramspressMH4BY7JUT4X2Y12D07= "e".split("SPLIT");
IScriptAction pressMH4BY7JUT4X2Y12D07 = newInstance("press");
pressMH4BY7JUT4X2Y12D07.execute(provider,macro,pressHBVQT1XSC01B11WC5Einstance,rawParamspressMH4BY7JUT4X2Y12D07,paramspressMH4BY7JUT4X2Y12D07);
while(!pressMH4BY7JUT4X2Y12D07.canExecuteNow(provider,macro,pressHBVQT1XSC01B11WC5Einstance,rawParamspressMH4BY7JUT4X2Y12D07,paramspressMH4BY7JUT4X2Y12D07)){}
IMacroAction waitQ94ZMIUIM2OSY8ONSHinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamswaitBJ5S0SQEEVS6GPE1PD = "15t";
String[] paramswaitBJ5S0SQEEVS6GPE1PD= "15t".split("SPLIT");
IScriptAction waitBJ5S0SQEEVS6GPE1PD = newInstance("wait");
waitBJ5S0SQEEVS6GPE1PD.execute(provider,macro,waitQ94ZMIUIM2OSY8ONSHinstance,rawParamswaitBJ5S0SQEEVS6GPE1PD,paramswaitBJ5S0SQEEVS6GPE1PD);
while(!waitBJ5S0SQEEVS6GPE1PD.canExecuteNow(provider,macro,waitQ94ZMIUIM2OSY8ONSHinstance,rawParamswaitBJ5S0SQEEVS6GPE1PD,paramswaitBJ5S0SQEEVS6GPE1PD)){}
}
IMacroAction looksVEN2ZM30PEYXAOOYOCinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamslooksPG781SCCEFDVJVYTN3 = "90 89 0.5";
String[] paramslooksPG781SCCEFDVJVYTN3= "90SPLIT89SPLIT0.5".split("SPLIT");
IScriptAction looksPG781SCCEFDVJVYTN3 = newInstance("looks");
looksPG781SCCEFDVJVYTN3.execute(provider,macro,looksVEN2ZM30PEYXAOOYOCinstance,rawParamslooksPG781SCCEFDVJVYTN3,paramslooksPG781SCCEFDVJVYTN3);
while(!looksPG781SCCEFDVJVYTN3.canExecuteNow(provider,macro,looksVEN2ZM30PEYXAOOYOCinstance,rawParamslooksPG781SCCEFDVJVYTN3,paramslooksPG781SCCEFDVJVYTN3)){}
IMacroAction pickFGP2T7S6DJWWXMCT68instance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamspick8HRYLYVY3L9C0VQK2O = "experience_bottle";
String[] paramspick8HRYLYVY3L9C0VQK2O= "experience_bottle".split("SPLIT");
IScriptAction pick8HRYLYVY3L9C0VQK2O = newInstance("pick");
pick8HRYLYVY3L9C0VQK2O.execute(provider,macro,pickFGP2T7S6DJWWXMCT68instance,rawParamspick8HRYLYVY3L9C0VQK2O,paramspick8HRYLYVY3L9C0VQK2O);
while(!pick8HRYLYVY3L9C0VQK2O.canExecuteNow(provider,macro,pickFGP2T7S6DJWWXMCT68instance,rawParamspick8HRYLYVY3L9C0VQK2O,paramspick8HRYLYVY3L9C0VQK2O)){}
IMacroAction waitTZB66SPP98SG563QI9instance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamswaitAEOMVF78CUCPNJ9CEM = "500ms";
String[] paramswaitAEOMVF78CUCPNJ9CEM= "500ms".split("SPLIT");
IScriptAction waitAEOMVF78CUCPNJ9CEM = newInstance("wait");
waitAEOMVF78CUCPNJ9CEM.execute(provider,macro,waitTZB66SPP98SG563QI9instance,rawParamswaitAEOMVF78CUCPNJ9CEM,paramswaitAEOMVF78CUCPNJ9CEM);
while(!waitAEOMVF78CUCPNJ9CEM.canExecuteNow(provider,macro,waitTZB66SPP98SG563QI9instance,rawParamswaitAEOMVF78CUCPNJ9CEM,paramswaitAEOMVF78CUCPNJ9CEM)){}
IMacroAction doXI1MX7P4VORQX7BGTHinstance = new FakeMacroAction();
do {
IMacroAction key933S2XE02VJVD6L1PTinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamskeyGZW139SOT3MLA7DZTM = "use";
String[] paramskeyGZW139SOT3MLA7DZTM= "use".split("SPLIT");
IScriptAction keyGZW139SOT3MLA7DZTM = newInstance("key");
keyGZW139SOT3MLA7DZTM.execute(provider,macro,key933S2XE02VJVD6L1PTinstance,rawParamskeyGZW139SOT3MLA7DZTM,paramskeyGZW139SOT3MLA7DZTM);
while(!keyGZW139SOT3MLA7DZTM.canExecuteNow(provider,macro,key933S2XE02VJVD6L1PTinstance,rawParamskeyGZW139SOT3MLA7DZTM,paramskeyGZW139SOT3MLA7DZTM)){}
IMacroAction waitAHOYHN70K6OXLY4980instance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamswaitOQDCYCK5WQX38W8NRA = "200ms";
String[] paramswaitOQDCYCK5WQX38W8NRA= "200ms".split("SPLIT");
IScriptAction waitOQDCYCK5WQX38W8NRA = newInstance("wait");
waitOQDCYCK5WQX38W8NRA.execute(provider,macro,waitAHOYHN70K6OXLY4980instance,rawParamswaitOQDCYCK5WQX38W8NRA,paramswaitOQDCYCK5WQX38W8NRA);
while(!waitOQDCYCK5WQX38W8NRA.canExecuteNow(provider,macro,waitAHOYHN70K6OXLY4980instance,rawParamswaitOQDCYCK5WQX38W8NRA,paramswaitOQDCYCK5WQX38W8NRA)){}
} while(provider.getExpressionEvaluator(macro,provider.expand(macro,"%level% == 5",true)).evaluate() == 0);
}
IMacroAction wait4CFZ6I85CK40HX8TALinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamswait43IOS4CZTN7WQDE3HQ = "2";
String[] paramswait43IOS4CZTN7WQDE3HQ= "2".split("SPLIT");
IScriptAction wait43IOS4CZTN7WQDE3HQ = newInstance("wait");
wait43IOS4CZTN7WQDE3HQ.execute(provider,macro,wait4CFZ6I85CK40HX8TALinstance,rawParamswait43IOS4CZTN7WQDE3HQ,paramswait43IOS4CZTN7WQDE3HQ);
while(!wait43IOS4CZTN7WQDE3HQ.canExecuteNow(provider,macro,wait4CFZ6I85CK40HX8TALinstance,rawParamswait43IOS4CZTN7WQDE3HQ,paramswait43IOS4CZTN7WQDE3HQ)){}
IMacroAction pickJ0SOP5JV90GYQSCN5Hinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamspick7PLDTR012PQWENW2HR = "golden_shovel";
String[] paramspick7PLDTR012PQWENW2HR= "golden_shovel".split("SPLIT");
IScriptAction pick7PLDTR012PQWENW2HR = newInstance("pick");
pick7PLDTR012PQWENW2HR.execute(provider,macro,pickJ0SOP5JV90GYQSCN5Hinstance,rawParamspick7PLDTR012PQWENW2HR,paramspick7PLDTR012PQWENW2HR);
while(!pick7PLDTR012PQWENW2HR.canExecuteNow(provider,macro,pickJ0SOP5JV90GYQSCN5Hinstance,rawParamspick7PLDTR012PQWENW2HR,paramspick7PLDTR012PQWENW2HR)){}
IMacroAction calcyawtoU0QQRY2S8DAVLIX9L9instance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamscalcyawto4HSZWJ5LGAP6GZYKKP = "-37 69.4 -111 #yaw #dist #pitch";
String[] paramscalcyawto4HSZWJ5LGAP6GZYKKP= "-37SPLIT69.4SPLIT-111SPLIT#yawSPLIT#distSPLIT#pitch".split("SPLIT");
IScriptAction calcyawto4HSZWJ5LGAP6GZYKKP = newInstance("calcyawto");
calcyawto4HSZWJ5LGAP6GZYKKP.execute(provider,macro,calcyawtoU0QQRY2S8DAVLIX9L9instance,rawParamscalcyawto4HSZWJ5LGAP6GZYKKP,paramscalcyawto4HSZWJ5LGAP6GZYKKP);
while(!calcyawto4HSZWJ5LGAP6GZYKKP.canExecuteNow(provider,macro,calcyawtoU0QQRY2S8DAVLIX9L9instance,rawParamscalcyawto4HSZWJ5LGAP6GZYKKP,paramscalcyawto4HSZWJ5LGAP6GZYKKP)){}
IMacroAction assignZTGC7YTA77KRQ1BC2Iinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamsassignFDPF58BPZW44YIH2MY = "%#yaw% + 180";
String[] paramsassignFDPF58BPZW44YIH2MY= "#yawSPLIT%#yaw% + 180".split("SPLIT");
IScriptAction assignFDPF58BPZW44YIH2MY = newInstance("assign");
assignFDPF58BPZW44YIH2MY.execute(provider,macro,assignZTGC7YTA77KRQ1BC2Iinstance,rawParamsassignFDPF58BPZW44YIH2MY,paramsassignFDPF58BPZW44YIH2MY);
while(!assignFDPF58BPZW44YIH2MY.canExecuteNow(provider,macro,assignZTGC7YTA77KRQ1BC2Iinstance,rawParamsassignFDPF58BPZW44YIH2MY,paramsassignFDPF58BPZW44YIH2MY)){}
IMacroAction looks4WTWRKYY06KDLK41F7instance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamslooksVDXIDE28VNO2QI4ESQ = "%#yaw% %#pitch% 0.5";
String[] paramslooksVDXIDE28VNO2QI4ESQ= "%#yaw%SPLIT%#pitch%SPLIT0.5".split("SPLIT");
IScriptAction looksVDXIDE28VNO2QI4ESQ = newInstance("looks");
looksVDXIDE28VNO2QI4ESQ.execute(provider,macro,looks4WTWRKYY06KDLK41F7instance,rawParamslooksVDXIDE28VNO2QI4ESQ,paramslooksVDXIDE28VNO2QI4ESQ);
while(!looksVDXIDE28VNO2QI4ESQ.canExecuteNow(provider,macro,looks4WTWRKYY06KDLK41F7instance,rawParamslooksVDXIDE28VNO2QI4ESQ,paramslooksVDXIDE28VNO2QI4ESQ)){}
IMacroAction waitX9NRB6OP06DTE9F9U4instance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamswait2R5VNKM2FDNYTXQNT1 = "500ms";
String[] paramswait2R5VNKM2FDNYTXQNT1= "500ms".split("SPLIT");
IScriptAction wait2R5VNKM2FDNYTXQNT1 = newInstance("wait");
wait2R5VNKM2FDNYTXQNT1.execute(provider,macro,waitX9NRB6OP06DTE9F9U4instance,rawParamswait2R5VNKM2FDNYTXQNT1,paramswait2R5VNKM2FDNYTXQNT1);
while(!wait2R5VNKM2FDNYTXQNT1.canExecuteNow(provider,macro,waitX9NRB6OP06DTE9F9U4instance,rawParamswait2R5VNKM2FDNYTXQNT1,paramswait2R5VNKM2FDNYTXQNT1)){}
IMacroAction looksXMNAOXEDDOZEFGPWBJinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamslooksKIRHPAUN5E2AVEF1CN = "%#yaw% %#pitch% 0.5";
String[] paramslooksKIRHPAUN5E2AVEF1CN= "%#yaw%SPLIT%#pitch%SPLIT0.5".split("SPLIT");
IScriptAction looksKIRHPAUN5E2AVEF1CN = newInstance("looks");
looksKIRHPAUN5E2AVEF1CN.execute(provider,macro,looksXMNAOXEDDOZEFGPWBJinstance,rawParamslooksKIRHPAUN5E2AVEF1CN,paramslooksKIRHPAUN5E2AVEF1CN);
while(!looksKIRHPAUN5E2AVEF1CN.canExecuteNow(provider,macro,looksXMNAOXEDDOZEFGPWBJinstance,rawParamslooksKIRHPAUN5E2AVEF1CN,paramslooksKIRHPAUN5E2AVEF1CN)){}
IMacroAction doG7AQVP596GJCYLJMXXinstance = new FakeMacroAction();
do {
IMacroAction keyGAU1J58BATH06189O8instance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamskeyE9V6SFG76J1PP638QC = "use";
String[] paramskeyE9V6SFG76J1PP638QC= "use".split("SPLIT");
IScriptAction keyE9V6SFG76J1PP638QC = newInstance("key");
keyE9V6SFG76J1PP638QC.execute(provider,macro,keyGAU1J58BATH06189O8instance,rawParamskeyE9V6SFG76J1PP638QC,paramskeyE9V6SFG76J1PP638QC);
while(!keyE9V6SFG76J1PP638QC.canExecuteNow(provider,macro,keyGAU1J58BATH06189O8instance,rawParamskeyE9V6SFG76J1PP638QC,paramskeyE9V6SFG76J1PP638QC)){}
IMacroAction waitSCE7PRMKWBZLFEHQWTinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamswaitL5Q30X4OV1BNEYU3VU = "1";
String[] paramswaitL5Q30X4OV1BNEYU3VU= "1".split("SPLIT");
IScriptAction waitL5Q30X4OV1BNEYU3VU = newInstance("wait");
waitL5Q30X4OV1BNEYU3VU.execute(provider,macro,waitSCE7PRMKWBZLFEHQWTinstance,rawParamswaitL5Q30X4OV1BNEYU3VU,paramswaitL5Q30X4OV1BNEYU3VU);
while(!waitL5Q30X4OV1BNEYU3VU.canExecuteNow(provider,macro,waitSCE7PRMKWBZLFEHQWTinstance,rawParamswaitL5Q30X4OV1BNEYU3VU,paramswaitL5Q30X4OV1BNEYU3VU)){}
} while(provider.getExpressionEvaluator(macro,provider.expand(macro,"%gui%!=\"none\"",true)).evaluate() == 0);
IMacroAction waitI2LMI9P6TW6TZPBMCBinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamswaitKTX7TN6ZAR075QMILI = "200ms";
String[] paramswaitKTX7TN6ZAR075QMILI= "200ms".split("SPLIT");
IScriptAction waitKTX7TN6ZAR075QMILI = newInstance("wait");
waitKTX7TN6ZAR075QMILI.execute(provider,macro,waitI2LMI9P6TW6TZPBMCBinstance,rawParamswaitKTX7TN6ZAR075QMILI,paramswaitKTX7TN6ZAR075QMILI);
while(!waitKTX7TN6ZAR075QMILI.canExecuteNow(provider,macro,waitI2LMI9P6TW6TZPBMCBinstance,rawParamswaitKTX7TN6ZAR075QMILI,paramswaitKTX7TN6ZAR075QMILI)){}
IMacroAction forS97RSYQEFOMNK1446Pinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamsforXTBJZR30GUNTW0XK6I = "#i 54 88";
String[] paramsforXTBJZR30GUNTW0XK6I= "#iSPLIT54SPLIT88".split("SPLIT");
IScriptAction forXTBJZR30GUNTW0XK6I = newInstance("for");
while(forXTBJZR30GUNTW0XK6I.executeStackPush(provider,macro,forS97RSYQEFOMNK1446Pinstance,rawParamsforXTBJZR30GUNTW0XK6I,paramsforXTBJZR30GUNTW0XK6I)) {
IMacroAction getslotitemDX6OSJ3YZC1DY8HFSVinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamsgetslotitemHVI3JSF511SH2ILTOU = "%#i% &id #size";
String[] paramsgetslotitemHVI3JSF511SH2ILTOU= "%#i%SPLIT&idSPLIT#size".split("SPLIT");
IScriptAction getslotitemHVI3JSF511SH2ILTOU = newInstance("getslotitem");
getslotitemHVI3JSF511SH2ILTOU.execute(provider,macro,getslotitemDX6OSJ3YZC1DY8HFSVinstance,rawParamsgetslotitemHVI3JSF511SH2ILTOU,paramsgetslotitemHVI3JSF511SH2ILTOU);
while(!getslotitemHVI3JSF511SH2ILTOU.canExecuteNow(provider,macro,getslotitemDX6OSJ3YZC1DY8HFSVinstance,rawParamsgetslotitemHVI3JSF511SH2ILTOU,paramsgetslotitemHVI3JSF511SH2ILTOU)){}
if(provider.getExpressionEvaluator(macro,provider.expand(macro,"%&id% == \"golden_shovel\"",true)).evaluate() != 0) {
IMacroAction slotclickMFWUZMGL53NDVLQ1T9instance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamsslotclickYJ21N8ZBWO64KJQQG1 = "%#i% left true";
String[] paramsslotclickYJ21N8ZBWO64KJQQG1= "%#i%SPLITleftSPLITtrue".split("SPLIT");
IScriptAction slotclickYJ21N8ZBWO64KJQQG1 = newInstance("slotclick");
slotclickYJ21N8ZBWO64KJQQG1.execute(provider,macro,slotclickMFWUZMGL53NDVLQ1T9instance,rawParamsslotclickYJ21N8ZBWO64KJQQG1,paramsslotclickYJ21N8ZBWO64KJQQG1);
while(!slotclickYJ21N8ZBWO64KJQQG1.canExecuteNow(provider,macro,slotclickMFWUZMGL53NDVLQ1T9instance,rawParamsslotclickYJ21N8ZBWO64KJQQG1,paramsslotclickYJ21N8ZBWO64KJQQG1)){}
IMacroAction wait8HJ35LZBAKOFQ2CGBOinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamswaitI8MCOCUNFNB8RYF0QN = "500ms";
String[] paramswaitI8MCOCUNFNB8RYF0QN= "500ms".split("SPLIT");
IScriptAction waitI8MCOCUNFNB8RYF0QN = newInstance("wait");
waitI8MCOCUNFNB8RYF0QN.execute(provider,macro,wait8HJ35LZBAKOFQ2CGBOinstance,rawParamswaitI8MCOCUNFNB8RYF0QN,paramswaitI8MCOCUNFNB8RYF0QN);
while(!waitI8MCOCUNFNB8RYF0QN.canExecuteNow(provider,macro,wait8HJ35LZBAKOFQ2CGBOinstance,rawParamswaitI8MCOCUNFNB8RYF0QN,paramswaitI8MCOCUNFNB8RYF0QN)){}
break;
}
}
IMacroAction slotclick0YTMKX07IP9BQSFD4Rinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamsslotclick5BCPR0DUTR56P7FNXV = "14";
String[] paramsslotclick5BCPR0DUTR56P7FNXV= "14".split("SPLIT");
IScriptAction slotclick5BCPR0DUTR56P7FNXV = newInstance("slotclick");
slotclick5BCPR0DUTR56P7FNXV.execute(provider,macro,slotclick0YTMKX07IP9BQSFD4Rinstance,rawParamsslotclick5BCPR0DUTR56P7FNXV,paramsslotclick5BCPR0DUTR56P7FNXV);
while(!slotclick5BCPR0DUTR56P7FNXV.canExecuteNow(provider,macro,slotclick0YTMKX07IP9BQSFD4Rinstance,rawParamsslotclick5BCPR0DUTR56P7FNXV,paramsslotclick5BCPR0DUTR56P7FNXV)){}
IMacroAction waitGMC3H2BSDX1ET7A4X6instance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamswaitE3LCLVDOVHOY0HKXJY = "15t";
String[] paramswaitE3LCLVDOVHOY0HKXJY= "15t".split("SPLIT");
IScriptAction waitE3LCLVDOVHOY0HKXJY = newInstance("wait");
waitE3LCLVDOVHOY0HKXJY.execute(provider,macro,waitGMC3H2BSDX1ET7A4X6instance,rawParamswaitE3LCLVDOVHOY0HKXJY,paramswaitE3LCLVDOVHOY0HKXJY);
while(!waitE3LCLVDOVHOY0HKXJY.canExecuteNow(provider,macro,waitGMC3H2BSDX1ET7A4X6instance,rawParamswaitE3LCLVDOVHOY0HKXJY,paramswaitE3LCLVDOVHOY0HKXJY)){}
IMacroAction slotclickFADQZAEWLXKOAMNJ6Finstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamsslotclickPHIZACCES6K0JZEO7C = "22";
String[] paramsslotclickPHIZACCES6K0JZEO7C= "22".split("SPLIT");
IScriptAction slotclickPHIZACCES6K0JZEO7C = newInstance("slotclick");
slotclickPHIZACCES6K0JZEO7C.execute(provider,macro,slotclickFADQZAEWLXKOAMNJ6Finstance,rawParamsslotclickPHIZACCES6K0JZEO7C,paramsslotclickPHIZACCES6K0JZEO7C);
while(!slotclickPHIZACCES6K0JZEO7C.canExecuteNow(provider,macro,slotclickFADQZAEWLXKOAMNJ6Finstance,rawParamsslotclickPHIZACCES6K0JZEO7C,paramsslotclickPHIZACCES6K0JZEO7C)){}
IMacroAction waitDMBTY9VXOCBQT0Q5E4instance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamswaitQR41LMWV4505KRGOLN = "15t";
String[] paramswaitQR41LMWV4505KRGOLN= "15t".split("SPLIT");
IScriptAction waitQR41LMWV4505KRGOLN = newInstance("wait");
waitQR41LMWV4505KRGOLN.execute(provider,macro,waitDMBTY9VXOCBQT0Q5E4instance,rawParamswaitQR41LMWV4505KRGOLN,paramswaitQR41LMWV4505KRGOLN);
while(!waitQR41LMWV4505KRGOLN.canExecuteNow(provider,macro,waitDMBTY9VXOCBQT0Q5E4instance,rawParamswaitQR41LMWV4505KRGOLN,paramswaitQR41LMWV4505KRGOLN)){}
IMacroAction pressLYQX4PTLQF5WD5ZWHOinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamspressLWSX46K1K1SA1LPASP = "e";
String[] paramspressLWSX46K1K1SA1LPASP= "e".split("SPLIT");
IScriptAction pressLWSX46K1K1SA1LPASP = newInstance("press");
pressLWSX46K1K1SA1LPASP.execute(provider,macro,pressLYQX4PTLQF5WD5ZWHOinstance,rawParamspressLWSX46K1K1SA1LPASP,paramspressLWSX46K1K1SA1LPASP);
while(!pressLWSX46K1K1SA1LPASP.canExecuteNow(provider,macro,pressLYQX4PTLQF5WD5ZWHOinstance,rawParamspressLWSX46K1K1SA1LPASP,paramspressLWSX46K1K1SA1LPASP)){}
IMacroAction waitW6HF4296QGVG0HEJBSinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamswait393188MCJKMV2BC3IL = "15t";
String[] paramswait393188MCJKMV2BC3IL= "15t".split("SPLIT");
IScriptAction wait393188MCJKMV2BC3IL = newInstance("wait");
wait393188MCJKMV2BC3IL.execute(provider,macro,waitW6HF4296QGVG0HEJBSinstance,rawParamswait393188MCJKMV2BC3IL,paramswait393188MCJKMV2BC3IL);
while(!wait393188MCJKMV2BC3IL.canExecuteNow(provider,macro,waitW6HF4296QGVG0HEJBSinstance,rawParamswait393188MCJKMV2BC3IL,paramswait393188MCJKMV2BC3IL)){}
}
if(provider.getExpressionEvaluator(macro,provider.expand(macro,"efficiency == false",true)).evaluate() != 0) {
IMacroAction assignDIK28HYZVB4XVX9SM2instance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamsassignLS4B3AUC3JI64EFA0E = "-37";
String[] paramsassignLS4B3AUC3JI64EFA0E= "#xSPLIT-37".split("SPLIT");
IScriptAction assignLS4B3AUC3JI64EFA0E = newInstance("assign");
assignLS4B3AUC3JI64EFA0E.execute(provider,macro,assignDIK28HYZVB4XVX9SM2instance,rawParamsassignLS4B3AUC3JI64EFA0E,paramsassignLS4B3AUC3JI64EFA0E);
while(!assignLS4B3AUC3JI64EFA0E.canExecuteNow(provider,macro,assignDIK28HYZVB4XVX9SM2instance,rawParamsassignLS4B3AUC3JI64EFA0E,paramsassignLS4B3AUC3JI64EFA0E)){}
IMacroAction assignKYD0HAOMS9KMR7ZHYZinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamsassignD69UOMUY5VLM6MXRNQ = "-114";
String[] paramsassignD69UOMUY5VLM6MXRNQ= "#zSPLIT-114".split("SPLIT");
IScriptAction assignD69UOMUY5VLM6MXRNQ = newInstance("assign");
assignD69UOMUY5VLM6MXRNQ.execute(provider,macro,assignKYD0HAOMS9KMR7ZHYZinstance,rawParamsassignD69UOMUY5VLM6MXRNQ,paramsassignD69UOMUY5VLM6MXRNQ);
while(!assignD69UOMUY5VLM6MXRNQ.canExecuteNow(provider,macro,assignKYD0HAOMS9KMR7ZHYZinstance,rawParamsassignD69UOMUY5VLM6MXRNQ,paramsassignD69UOMUY5VLM6MXRNQ)){}
IMacroAction do0VDERHX20148DMJP1Winstance = new FakeMacroAction();
do {
IMacroAction calcyawtoWMMQJE8ICH117J3HQBinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamscalcyawtoRLULYQF1J12HW88PYJ = "-35.5 70 -112.5 #yaw #pitch #dist";
String[] paramscalcyawtoRLULYQF1J12HW88PYJ= "-35.5SPLIT70SPLIT-112.5SPLIT#yawSPLIT#pitchSPLIT#dist".split("SPLIT");
IScriptAction calcyawtoRLULYQF1J12HW88PYJ = newInstance("calcyawto");
calcyawtoRLULYQF1J12HW88PYJ.execute(provider,macro,calcyawtoWMMQJE8ICH117J3HQBinstance,rawParamscalcyawtoRLULYQF1J12HW88PYJ,paramscalcyawtoRLULYQF1J12HW88PYJ);
while(!calcyawtoRLULYQF1J12HW88PYJ.canExecuteNow(provider,macro,calcyawtoWMMQJE8ICH117J3HQBinstance,rawParamscalcyawtoRLULYQF1J12HW88PYJ,paramscalcyawtoRLULYQF1J12HW88PYJ)){}
IMacroAction assignG7J2373G306KN6GTA0instance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamsassignQC3RMZ7W39RQ2K34T6 = "%#yaw% + 180";
String[] paramsassignQC3RMZ7W39RQ2K34T6= "#yawSPLIT%#yaw% + 180".split("SPLIT");
IScriptAction assignQC3RMZ7W39RQ2K34T6 = newInstance("assign");
assignQC3RMZ7W39RQ2K34T6.execute(provider,macro,assignG7J2373G306KN6GTA0instance,rawParamsassignQC3RMZ7W39RQ2K34T6,paramsassignQC3RMZ7W39RQ2K34T6);
while(!assignQC3RMZ7W39RQ2K34T6.canExecuteNow(provider,macro,assignG7J2373G306KN6GTA0instance,rawParamsassignQC3RMZ7W39RQ2K34T6,paramsassignQC3RMZ7W39RQ2K34T6)){}
IMacroAction gotoVGCHU7JICW7M8VD2QUinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamsgotoVGPVWT7OQCOGUFSTMF = "%#x%  %#z%";
String[] paramsgotoVGPVWT7OQCOGUFSTMF= "%#x%SPLITSPLIT%#z%".split("SPLIT");
IScriptAction gotoVGPVWT7OQCOGUFSTMF = newInstance("goto");
gotoVGPVWT7OQCOGUFSTMF.execute(provider,macro,gotoVGCHU7JICW7M8VD2QUinstance,rawParamsgotoVGPVWT7OQCOGUFSTMF,paramsgotoVGPVWT7OQCOGUFSTMF);
while(!gotoVGPVWT7OQCOGUFSTMF.canExecuteNow(provider,macro,gotoVGCHU7JICW7M8VD2QUinstance,rawParamsgotoVGPVWT7OQCOGUFSTMF,paramsgotoVGPVWT7OQCOGUFSTMF)){}
IMacroAction looks9ABQ4P9YRE1SBS3JSEinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamslooksJEMIXX7B0YIVMNORUQ = "%#yaw% 0 0.5";
String[] paramslooksJEMIXX7B0YIVMNORUQ= "%#yaw%SPLIT0SPLIT0.5".split("SPLIT");
IScriptAction looksJEMIXX7B0YIVMNORUQ = newInstance("looks");
looksJEMIXX7B0YIVMNORUQ.execute(provider,macro,looks9ABQ4P9YRE1SBS3JSEinstance,rawParamslooksJEMIXX7B0YIVMNORUQ,paramslooksJEMIXX7B0YIVMNORUQ);
while(!looksJEMIXX7B0YIVMNORUQ.canExecuteNow(provider,macro,looks9ABQ4P9YRE1SBS3JSEinstance,rawParamslooksJEMIXX7B0YIVMNORUQ,paramslooksJEMIXX7B0YIVMNORUQ)){}
} while(provider.getExpressionEvaluator(macro,provider.expand(macro,"(xpos==%#x%)&&(zpos==%#z%)",true)).evaluate() == 0);
if(provider.getExpressionEvaluator(macro,provider.expand(macro,"%level% < 20",true)).evaluate() != 0) {
setActionsCurrentTickMax(100);
IMacroAction assignROB5TD4FKKNIWLSGMFinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamsassignWH7WX35KWA6S6Q9Y91 = "0";
String[] paramsassignWH7WX35KWA6S6Q9Y91= "#bottleSPLIT0".split("SPLIT");
IScriptAction assignWH7WX35KWA6S6Q9Y91 = newInstance("assign");
assignWH7WX35KWA6S6Q9Y91.execute(provider,macro,assignROB5TD4FKKNIWLSGMFinstance,rawParamsassignWH7WX35KWA6S6Q9Y91,paramsassignWH7WX35KWA6S6Q9Y91);
while(!assignWH7WX35KWA6S6Q9Y91.canExecuteNow(provider,macro,assignROB5TD4FKKNIWLSGMFinstance,rawParamsassignWH7WX35KWA6S6Q9Y91,paramsassignWH7WX35KWA6S6Q9Y91)){}
IMacroAction forVOIT24JSM3008IERZFinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamsforOERMSSNGRMFSDXMBNZ = "#i = 36 to 43 step 1";
String[] paramsforOERMSSNGRMFSDXMBNZ= "#i = 36 to 43 step 1".split("SPLIT");
IScriptAction forOERMSSNGRMFSDXMBNZ = newInstance("for");
while(forOERMSSNGRMFSDXMBNZ.executeStackPush(provider,macro,forVOIT24JSM3008IERZFinstance,rawParamsforOERMSSNGRMFSDXMBNZ,paramsforOERMSSNGRMFSDXMBNZ)) {
IMacroAction getslotiteminvH0W04TWSIWIJ69JZG7instance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamsgetslotiteminvOJQREDNHSXDE9BE33H = "%#i% &id #stacksize #data &nbt";
String[] paramsgetslotiteminvOJQREDNHSXDE9BE33H= "%#i%SPLIT&idSPLIT#stacksizeSPLIT#dataSPLIT&nbt".split("SPLIT");
IScriptAction getslotiteminvOJQREDNHSXDE9BE33H = newInstance("getslotiteminv");
getslotiteminvOJQREDNHSXDE9BE33H.execute(provider,macro,getslotiteminvH0W04TWSIWIJ69JZG7instance,rawParamsgetslotiteminvOJQREDNHSXDE9BE33H,paramsgetslotiteminvOJQREDNHSXDE9BE33H);
while(!getslotiteminvOJQREDNHSXDE9BE33H.canExecuteNow(provider,macro,getslotiteminvH0W04TWSIWIJ69JZG7instance,rawParamsgetslotiteminvOJQREDNHSXDE9BE33H,paramsgetslotiteminvOJQREDNHSXDE9BE33H)){}
IMacroAction ifcontains2RRYEGV5738PZTOIELinstance = new FakeMacroAction();
String rawParamsifcontainsRE405UZLTXI2RGB2MP = "%&id% bottle";
String[] paramsifcontainsRE405UZLTXI2RGB2MP= "%&id%SPLITbottle".split("SPLIT");
IScriptAction ifcontainsRE405UZLTXI2RGB2MP = newInstance("ifcontains");
if(ifcontainsRE405UZLTXI2RGB2MP.executeConditional(provider,macro,ifcontains2RRYEGV5738PZTOIELinstance,rawParamsifcontainsRE405UZLTXI2RGB2MP,paramsifcontainsRE405UZLTXI2RGB2MP)) {
IMacroAction inc6F1S2B3P5XUP8BVEWAinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamsinc35AOQ58B5KHELI9CAT = "#bottle %#stacksize%";
String[] paramsinc35AOQ58B5KHELI9CAT= "#bottleSPLIT%#stacksize%".split("SPLIT");
IScriptAction inc35AOQ58B5KHELI9CAT = newInstance("inc");
inc35AOQ58B5KHELI9CAT.execute(provider,macro,inc6F1S2B3P5XUP8BVEWAinstance,rawParamsinc35AOQ58B5KHELI9CAT,paramsinc35AOQ58B5KHELI9CAT);
while(!inc35AOQ58B5KHELI9CAT.canExecuteNow(provider,macro,inc6F1S2B3P5XUP8BVEWAinstance,rawParamsinc35AOQ58B5KHELI9CAT,paramsinc35AOQ58B5KHELI9CAT)){}
}
}
setActionsCurrentTickMax(100);
if(provider.getExpressionEvaluator(macro,provider.expand(macro,"#bottle < 128",true)).evaluate() != 0) {
IMacroAction calcyawtoJ7153IXWEYAYGBIPFTinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamscalcyawtoRDXBHIICSBJFZ65EY8 = "-35.5 70 -112.5 #yaw #pitch #dist";
String[] paramscalcyawtoRDXBHIICSBJFZ65EY8= "-35.5SPLIT70SPLIT-112.5SPLIT#yawSPLIT#pitchSPLIT#dist".split("SPLIT");
IScriptAction calcyawtoRDXBHIICSBJFZ65EY8 = newInstance("calcyawto");
calcyawtoRDXBHIICSBJFZ65EY8.execute(provider,macro,calcyawtoJ7153IXWEYAYGBIPFTinstance,rawParamscalcyawtoRDXBHIICSBJFZ65EY8,paramscalcyawtoRDXBHIICSBJFZ65EY8);
while(!calcyawtoRDXBHIICSBJFZ65EY8.canExecuteNow(provider,macro,calcyawtoJ7153IXWEYAYGBIPFTinstance,rawParamscalcyawtoRDXBHIICSBJFZ65EY8,paramscalcyawtoRDXBHIICSBJFZ65EY8)){}
IMacroAction assignN81VEVYLIWZFOU3UK8instance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamsassignMKKGTY415AND2V407C = "%#yaw% + 180";
String[] paramsassignMKKGTY415AND2V407C= "#yawSPLIT%#yaw% + 180".split("SPLIT");
IScriptAction assignMKKGTY415AND2V407C = newInstance("assign");
assignMKKGTY415AND2V407C.execute(provider,macro,assignN81VEVYLIWZFOU3UK8instance,rawParamsassignMKKGTY415AND2V407C,paramsassignMKKGTY415AND2V407C);
while(!assignMKKGTY415AND2V407C.canExecuteNow(provider,macro,assignN81VEVYLIWZFOU3UK8instance,rawParamsassignMKKGTY415AND2V407C,paramsassignMKKGTY415AND2V407C)){}
IMacroAction looksSFZZ4OBG6380C82TG7instance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamslooksWXPC8347ONRCQL3N7V = "%#yaw% 0 0.5";
String[] paramslooksWXPC8347ONRCQL3N7V= "%#yaw%SPLIT0SPLIT0.5".split("SPLIT");
IScriptAction looksWXPC8347ONRCQL3N7V = newInstance("looks");
looksWXPC8347ONRCQL3N7V.execute(provider,macro,looksSFZZ4OBG6380C82TG7instance,rawParamslooksWXPC8347ONRCQL3N7V,paramslooksWXPC8347ONRCQL3N7V);
while(!looksWXPC8347ONRCQL3N7V.canExecuteNow(provider,macro,looksSFZZ4OBG6380C82TG7instance,rawParamslooksWXPC8347ONRCQL3N7V,paramslooksWXPC8347ONRCQL3N7V)){}
IMacroAction do98Z2QVH548ZXBYK41Binstance = new FakeMacroAction();
do {
IMacroAction keyONTC0B693MLZE0LI2Qinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamskeyKY7ROMG2GUT75PX4QS = "use";
String[] paramskeyKY7ROMG2GUT75PX4QS= "use".split("SPLIT");
IScriptAction keyKY7ROMG2GUT75PX4QS = newInstance("key");
keyKY7ROMG2GUT75PX4QS.execute(provider,macro,keyONTC0B693MLZE0LI2Qinstance,rawParamskeyKY7ROMG2GUT75PX4QS,paramskeyKY7ROMG2GUT75PX4QS);
while(!keyKY7ROMG2GUT75PX4QS.canExecuteNow(provider,macro,keyONTC0B693MLZE0LI2Qinstance,rawParamskeyKY7ROMG2GUT75PX4QS,paramskeyKY7ROMG2GUT75PX4QS)){}
IMacroAction waitZA36Q0JBFV0GYCFNCEinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamswaitBAXKUF2SF01Z837X6R = "1";
String[] paramswaitBAXKUF2SF01Z837X6R= "1".split("SPLIT");
IScriptAction waitBAXKUF2SF01Z837X6R = newInstance("wait");
waitBAXKUF2SF01Z837X6R.execute(provider,macro,waitZA36Q0JBFV0GYCFNCEinstance,rawParamswaitBAXKUF2SF01Z837X6R,paramswaitBAXKUF2SF01Z837X6R);
while(!waitBAXKUF2SF01Z837X6R.canExecuteNow(provider,macro,waitZA36Q0JBFV0GYCFNCEinstance,rawParamswaitBAXKUF2SF01Z837X6R,paramswaitBAXKUF2SF01Z837X6R)){}
} while(provider.getExpressionEvaluator(macro,provider.expand(macro,"%gui%!=\"none\"",true)).evaluate() == 0);
IMacroAction waitUABFAJ9OQF7YZEOPPNinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamswaitVISU53FQ07WCKHUIF5 = "200ms";
String[] paramswaitVISU53FQ07WCKHUIF5= "200ms".split("SPLIT");
IScriptAction waitVISU53FQ07WCKHUIF5 = newInstance("wait");
waitVISU53FQ07WCKHUIF5.execute(provider,macro,waitUABFAJ9OQF7YZEOPPNinstance,rawParamswaitVISU53FQ07WCKHUIF5,paramswaitVISU53FQ07WCKHUIF5);
while(!waitVISU53FQ07WCKHUIF5.canExecuteNow(provider,macro,waitUABFAJ9OQF7YZEOPPNinstance,rawParamswaitVISU53FQ07WCKHUIF5,paramswaitVISU53FQ07WCKHUIF5)){}
IMacroAction slotclickNSJNH7YX04VIJ6HXOOinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamsslotclickIFREC91LCLYSE1J7QD = "10 right false";
String[] paramsslotclickIFREC91LCLYSE1J7QD= "10SPLITrightSPLITfalse".split("SPLIT");
IScriptAction slotclickIFREC91LCLYSE1J7QD = newInstance("slotclick");
slotclickIFREC91LCLYSE1J7QD.execute(provider,macro,slotclickNSJNH7YX04VIJ6HXOOinstance,rawParamsslotclickIFREC91LCLYSE1J7QD,paramsslotclickIFREC91LCLYSE1J7QD);
while(!slotclickIFREC91LCLYSE1J7QD.canExecuteNow(provider,macro,slotclickNSJNH7YX04VIJ6HXOOinstance,rawParamsslotclickIFREC91LCLYSE1J7QD,paramsslotclickIFREC91LCLYSE1J7QD)){}
IMacroAction waitD8VBGYZ451R5ZOHRT6instance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamswaitUHLPU5GIK8B8SA5IFF = "15t";
String[] paramswaitUHLPU5GIK8B8SA5IFF= "15t".split("SPLIT");
IScriptAction waitUHLPU5GIK8B8SA5IFF = newInstance("wait");
waitUHLPU5GIK8B8SA5IFF.execute(provider,macro,waitD8VBGYZ451R5ZOHRT6instance,rawParamswaitUHLPU5GIK8B8SA5IFF,paramswaitUHLPU5GIK8B8SA5IFF);
while(!waitUHLPU5GIK8B8SA5IFF.canExecuteNow(provider,macro,waitD8VBGYZ451R5ZOHRT6instance,rawParamswaitUHLPU5GIK8B8SA5IFF,paramswaitUHLPU5GIK8B8SA5IFF)){}
IMacroAction slotclick8X4J27540XHARPWWSPinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamsslotclick3TBVE2B44XH4T0JLUL = "24";
String[] paramsslotclick3TBVE2B44XH4T0JLUL= "24".split("SPLIT");
IScriptAction slotclick3TBVE2B44XH4T0JLUL = newInstance("slotclick");
slotclick3TBVE2B44XH4T0JLUL.execute(provider,macro,slotclick8X4J27540XHARPWWSPinstance,rawParamsslotclick3TBVE2B44XH4T0JLUL,paramsslotclick3TBVE2B44XH4T0JLUL);
while(!slotclick3TBVE2B44XH4T0JLUL.canExecuteNow(provider,macro,slotclick8X4J27540XHARPWWSPinstance,rawParamsslotclick3TBVE2B44XH4T0JLUL,paramsslotclick3TBVE2B44XH4T0JLUL)){}
IMacroAction wait6W50ASZ466F9JKG2RSinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamswaitS2TI3NWPZRY3SXV9F7 = "15t";
String[] paramswaitS2TI3NWPZRY3SXV9F7= "15t".split("SPLIT");
IScriptAction waitS2TI3NWPZRY3SXV9F7 = newInstance("wait");
waitS2TI3NWPZRY3SXV9F7.execute(provider,macro,wait6W50ASZ466F9JKG2RSinstance,rawParamswaitS2TI3NWPZRY3SXV9F7,paramswaitS2TI3NWPZRY3SXV9F7);
while(!waitS2TI3NWPZRY3SXV9F7.canExecuteNow(provider,macro,wait6W50ASZ466F9JKG2RSinstance,rawParamswaitS2TI3NWPZRY3SXV9F7,paramswaitS2TI3NWPZRY3SXV9F7)){}
IMacroAction slotclick2S498QBP77Z9KLPJZGinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamsslotclickE0MVYM5DO9UICF7LWJ = "24";
String[] paramsslotclickE0MVYM5DO9UICF7LWJ= "24".split("SPLIT");
IScriptAction slotclickE0MVYM5DO9UICF7LWJ = newInstance("slotclick");
slotclickE0MVYM5DO9UICF7LWJ.execute(provider,macro,slotclick2S498QBP77Z9KLPJZGinstance,rawParamsslotclickE0MVYM5DO9UICF7LWJ,paramsslotclickE0MVYM5DO9UICF7LWJ);
while(!slotclickE0MVYM5DO9UICF7LWJ.canExecuteNow(provider,macro,slotclick2S498QBP77Z9KLPJZGinstance,rawParamsslotclickE0MVYM5DO9UICF7LWJ,paramsslotclickE0MVYM5DO9UICF7LWJ)){}
IMacroAction waitW5SPV8L58V6ZKXIS8Pinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamswaitJK48URAM8T81ZXJU6N = "15t";
String[] paramswaitJK48URAM8T81ZXJU6N= "15t".split("SPLIT");
IScriptAction waitJK48URAM8T81ZXJU6N = newInstance("wait");
waitJK48URAM8T81ZXJU6N.execute(provider,macro,waitW5SPV8L58V6ZKXIS8Pinstance,rawParamswaitJK48URAM8T81ZXJU6N,paramswaitJK48URAM8T81ZXJU6N);
while(!waitJK48URAM8T81ZXJU6N.canExecuteNow(provider,macro,waitW5SPV8L58V6ZKXIS8Pinstance,rawParamswaitJK48URAM8T81ZXJU6N,paramswaitJK48URAM8T81ZXJU6N)){}
IMacroAction slotclickBK5JDO6UNOD6O5FXNTinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamsslotclickONZULM2P2JQ0DHGDE1 = "23";
String[] paramsslotclickONZULM2P2JQ0DHGDE1= "23".split("SPLIT");
IScriptAction slotclickONZULM2P2JQ0DHGDE1 = newInstance("slotclick");
slotclickONZULM2P2JQ0DHGDE1.execute(provider,macro,slotclickBK5JDO6UNOD6O5FXNTinstance,rawParamsslotclickONZULM2P2JQ0DHGDE1,paramsslotclickONZULM2P2JQ0DHGDE1);
while(!slotclickONZULM2P2JQ0DHGDE1.canExecuteNow(provider,macro,slotclickBK5JDO6UNOD6O5FXNTinstance,rawParamsslotclickONZULM2P2JQ0DHGDE1,paramsslotclickONZULM2P2JQ0DHGDE1)){}
IMacroAction wait1K1S25UBD8EVPG8VF1instance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamswaitOMDJEZ0JK0O1IEZW0O = "15t";
String[] paramswaitOMDJEZ0JK0O1IEZW0O= "15t".split("SPLIT");
IScriptAction waitOMDJEZ0JK0O1IEZW0O = newInstance("wait");
waitOMDJEZ0JK0O1IEZW0O.execute(provider,macro,wait1K1S25UBD8EVPG8VF1instance,rawParamswaitOMDJEZ0JK0O1IEZW0O,paramswaitOMDJEZ0JK0O1IEZW0O);
while(!waitOMDJEZ0JK0O1IEZW0O.canExecuteNow(provider,macro,wait1K1S25UBD8EVPG8VF1instance,rawParamswaitOMDJEZ0JK0O1IEZW0O,paramswaitOMDJEZ0JK0O1IEZW0O)){}
IMacroAction pressDAFYJMJATR3TRP7EJRinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamspressPFD4OELYAA6VMOHDZO = "e";
String[] paramspressPFD4OELYAA6VMOHDZO= "e".split("SPLIT");
IScriptAction pressPFD4OELYAA6VMOHDZO = newInstance("press");
pressPFD4OELYAA6VMOHDZO.execute(provider,macro,pressDAFYJMJATR3TRP7EJRinstance,rawParamspressPFD4OELYAA6VMOHDZO,paramspressPFD4OELYAA6VMOHDZO);
while(!pressPFD4OELYAA6VMOHDZO.canExecuteNow(provider,macro,pressDAFYJMJATR3TRP7EJRinstance,rawParamspressPFD4OELYAA6VMOHDZO,paramspressPFD4OELYAA6VMOHDZO)){}
IMacroAction waitRTQ1OYBR1WJHX53N64instance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamswaitK82PY2WQASAODNUBBY = "15t";
String[] paramswaitK82PY2WQASAODNUBBY= "15t".split("SPLIT");
IScriptAction waitK82PY2WQASAODNUBBY = newInstance("wait");
waitK82PY2WQASAODNUBBY.execute(provider,macro,waitRTQ1OYBR1WJHX53N64instance,rawParamswaitK82PY2WQASAODNUBBY,paramswaitK82PY2WQASAODNUBBY);
while(!waitK82PY2WQASAODNUBBY.canExecuteNow(provider,macro,waitRTQ1OYBR1WJHX53N64instance,rawParamswaitK82PY2WQASAODNUBBY,paramswaitK82PY2WQASAODNUBBY)){}
}
IMacroAction assign14QJ2TUI2YDPFYI1XOinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamsassign7RZLAXZMVNY5IH34R4 = "0";
String[] paramsassign7RZLAXZMVNY5IH34R4= "#bottleslotSPLIT0".split("SPLIT");
IScriptAction assign7RZLAXZMVNY5IH34R4 = newInstance("assign");
assign7RZLAXZMVNY5IH34R4.execute(provider,macro,assign14QJ2TUI2YDPFYI1XOinstance,rawParamsassign7RZLAXZMVNY5IH34R4,paramsassign7RZLAXZMVNY5IH34R4);
while(!assign7RZLAXZMVNY5IH34R4.canExecuteNow(provider,macro,assign14QJ2TUI2YDPFYI1XOinstance,rawParamsassign7RZLAXZMVNY5IH34R4,paramsassign7RZLAXZMVNY5IH34R4)){}
IMacroAction assignZ73BBA2PD0N76SW8ABinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamsassign5TXZ6WVE9JTO51WCB5 = "0";
String[] paramsassign5TXZ6WVE9JTO51WCB5= "#bottleslot2SPLIT0".split("SPLIT");
IScriptAction assign5TXZ6WVE9JTO51WCB5 = newInstance("assign");
assign5TXZ6WVE9JTO51WCB5.execute(provider,macro,assignZ73BBA2PD0N76SW8ABinstance,rawParamsassign5TXZ6WVE9JTO51WCB5,paramsassign5TXZ6WVE9JTO51WCB5);
while(!assign5TXZ6WVE9JTO51WCB5.canExecuteNow(provider,macro,assignZ73BBA2PD0N76SW8ABinstance,rawParamsassign5TXZ6WVE9JTO51WCB5,paramsassign5TXZ6WVE9JTO51WCB5)){}
IMacroAction assignEMRBFAGUUU8VEDOPP6instance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamsassignJ8CJICXX1NET4Z4AT2 = "false";
String[] paramsassignJ8CJICXX1NET4Z4AT2= "checkSPLITFalse".split("SPLIT");
IScriptAction assignJ8CJICXX1NET4Z4AT2 = newInstance("assign");
assignJ8CJICXX1NET4Z4AT2.execute(provider,macro,assignEMRBFAGUUU8VEDOPP6instance,rawParamsassignJ8CJICXX1NET4Z4AT2,paramsassignJ8CJICXX1NET4Z4AT2);
while(!assignJ8CJICXX1NET4Z4AT2.canExecuteNow(provider,macro,assignEMRBFAGUUU8VEDOPP6instance,rawParamsassignJ8CJICXX1NET4Z4AT2,paramsassignJ8CJICXX1NET4Z4AT2)){}
IMacroAction forMQQZ68Z5LF2MJW6K6Qinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamsforBC2VFQYGRO55LSA5R4 = "#i = 9 to 35 step 1";
String[] paramsforBC2VFQYGRO55LSA5R4= "#i = 9 to 35 step 1".split("SPLIT");
IScriptAction forBC2VFQYGRO55LSA5R4 = newInstance("for");
while(forBC2VFQYGRO55LSA5R4.executeStackPush(provider,macro,forMQQZ68Z5LF2MJW6K6Qinstance,rawParamsforBC2VFQYGRO55LSA5R4,paramsforBC2VFQYGRO55LSA5R4)) {
IMacroAction getslotiteminv8Z3YGS517IEIV1XIOQinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamsgetslotiteminvUJXLM17JN18EF3ZPTI = "%#i% &id #stacksize #data &nbt";
String[] paramsgetslotiteminvUJXLM17JN18EF3ZPTI= "%#i%SPLIT&idSPLIT#stacksizeSPLIT#dataSPLIT&nbt".split("SPLIT");
IScriptAction getslotiteminvUJXLM17JN18EF3ZPTI = newInstance("getslotiteminv");
getslotiteminvUJXLM17JN18EF3ZPTI.execute(provider,macro,getslotiteminv8Z3YGS517IEIV1XIOQinstance,rawParamsgetslotiteminvUJXLM17JN18EF3ZPTI,paramsgetslotiteminvUJXLM17JN18EF3ZPTI);
while(!getslotiteminvUJXLM17JN18EF3ZPTI.canExecuteNow(provider,macro,getslotiteminv8Z3YGS517IEIV1XIOQinstance,rawParamsgetslotiteminvUJXLM17JN18EF3ZPTI,paramsgetslotiteminvUJXLM17JN18EF3ZPTI)){}
if(provider.getExpressionEvaluator(macro,provider.expand(macro,"&id == \"experience_bottle\"",true)).evaluate() != 0) {
if(provider.getExpressionEvaluator(macro,provider.expand(macro,"!check",true)).evaluate() != 0) {
IMacroAction assignOCA1EHHXMEMW9V24IFinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamsassign87R2H146W912SM1CBZ = "%#i%";
String[] paramsassign87R2H146W912SM1CBZ= "#bottleslotSPLIT%#i%".split("SPLIT");
IScriptAction assign87R2H146W912SM1CBZ = newInstance("assign");
assign87R2H146W912SM1CBZ.execute(provider,macro,assignOCA1EHHXMEMW9V24IFinstance,rawParamsassign87R2H146W912SM1CBZ,paramsassign87R2H146W912SM1CBZ);
while(!assign87R2H146W912SM1CBZ.canExecuteNow(provider,macro,assignOCA1EHHXMEMW9V24IFinstance,rawParamsassign87R2H146W912SM1CBZ,paramsassign87R2H146W912SM1CBZ)){}
IMacroAction setXV2Y5NFF3CJCAAJS68instance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamssetM1TNT0O6DG9P031I4C = "check";
String[] paramssetM1TNT0O6DG9P031I4C= "check".split("SPLIT");
IScriptAction setM1TNT0O6DG9P031I4C = newInstance("set");
setM1TNT0O6DG9P031I4C.execute(provider,macro,setXV2Y5NFF3CJCAAJS68instance,rawParamssetM1TNT0O6DG9P031I4C,paramssetM1TNT0O6DG9P031I4C);
while(!setM1TNT0O6DG9P031I4C.canExecuteNow(provider,macro,setXV2Y5NFF3CJCAAJS68instance,rawParamssetM1TNT0O6DG9P031I4C,paramssetM1TNT0O6DG9P031I4C)){}
} else {
IMacroAction assign93LOG7RAE3JCJBMEODinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamsassignC81DDSFTRTMEEB1Z5L = "%#i%";
String[] paramsassignC81DDSFTRTMEEB1Z5L= "#bottleslot2SPLIT%#i%".split("SPLIT");
IScriptAction assignC81DDSFTRTMEEB1Z5L = newInstance("assign");
assignC81DDSFTRTMEEB1Z5L.execute(provider,macro,assign93LOG7RAE3JCJBMEODinstance,rawParamsassignC81DDSFTRTMEEB1Z5L,paramsassignC81DDSFTRTMEEB1Z5L);
while(!assignC81DDSFTRTMEEB1Z5L.canExecuteNow(provider,macro,assign93LOG7RAE3JCJBMEODinstance,rawParamsassignC81DDSFTRTMEEB1Z5L,paramsassignC81DDSFTRTMEEB1Z5L)){}
break;
}
}
}
if(provider.getExpressionEvaluator(macro,provider.expand(macro,"#bottleslot != 0",true)).evaluate() != 0) {
IMacroAction doWG9DQO8KGOBISWGIZ4instance = new FakeMacroAction();
do {
IMacroAction typeUMK4RFP4UW1W9FIMJGinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamstype1OKXAUKYX042G1BDUP = "e";
String[] paramstype1OKXAUKYX042G1BDUP= "e".split("SPLIT");
IScriptAction type1OKXAUKYX042G1BDUP = newInstance("type");
type1OKXAUKYX042G1BDUP.execute(provider,macro,typeUMK4RFP4UW1W9FIMJGinstance,rawParamstype1OKXAUKYX042G1BDUP,paramstype1OKXAUKYX042G1BDUP);
while(!type1OKXAUKYX042G1BDUP.canExecuteNow(provider,macro,typeUMK4RFP4UW1W9FIMJGinstance,rawParamstype1OKXAUKYX042G1BDUP,paramstype1OKXAUKYX042G1BDUP)){}
IMacroAction waitOXRX6VMXAACJRYUU7Binstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamswait7XEJ0HP6BYLUPCFGBV = "1";
String[] paramswait7XEJ0HP6BYLUPCFGBV= "1".split("SPLIT");
IScriptAction wait7XEJ0HP6BYLUPCFGBV = newInstance("wait");
wait7XEJ0HP6BYLUPCFGBV.execute(provider,macro,waitOXRX6VMXAACJRYUU7Binstance,rawParamswait7XEJ0HP6BYLUPCFGBV,paramswait7XEJ0HP6BYLUPCFGBV);
while(!wait7XEJ0HP6BYLUPCFGBV.canExecuteNow(provider,macro,waitOXRX6VMXAACJRYUU7Binstance,rawParamswait7XEJ0HP6BYLUPCFGBV,paramswait7XEJ0HP6BYLUPCFGBV)){}
} while(provider.getExpressionEvaluator(macro,provider.expand(macro,"%gui%!=\"none\"",true)).evaluate() == 0);
IMacroAction slotclick2SA965OP0XJDHU7C0Kinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamsslotclickUDW13Y1T9LHTZNTRBH = "%#bottleslot%";
String[] paramsslotclickUDW13Y1T9LHTZNTRBH= "%#bottleslot%".split("SPLIT");
IScriptAction slotclickUDW13Y1T9LHTZNTRBH = newInstance("slotclick");
slotclickUDW13Y1T9LHTZNTRBH.execute(provider,macro,slotclick2SA965OP0XJDHU7C0Kinstance,rawParamsslotclickUDW13Y1T9LHTZNTRBH,paramsslotclickUDW13Y1T9LHTZNTRBH);
while(!slotclickUDW13Y1T9LHTZNTRBH.canExecuteNow(provider,macro,slotclick2SA965OP0XJDHU7C0Kinstance,rawParamsslotclickUDW13Y1T9LHTZNTRBH,paramsslotclickUDW13Y1T9LHTZNTRBH)){}
IMacroAction waitP2F6HCHXJ3B9SUDW1Jinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamswaitJ02GZWPVNQSOXKWG5I = "500ms";
String[] paramswaitJ02GZWPVNQSOXKWG5I= "500ms".split("SPLIT");
IScriptAction waitJ02GZWPVNQSOXKWG5I = newInstance("wait");
waitJ02GZWPVNQSOXKWG5I.execute(provider,macro,waitP2F6HCHXJ3B9SUDW1Jinstance,rawParamswaitJ02GZWPVNQSOXKWG5I,paramswaitJ02GZWPVNQSOXKWG5I);
while(!waitJ02GZWPVNQSOXKWG5I.canExecuteNow(provider,macro,waitP2F6HCHXJ3B9SUDW1Jinstance,rawParamswaitJ02GZWPVNQSOXKWG5I,paramswaitJ02GZWPVNQSOXKWG5I)){}
IMacroAction slotclickW00J1FOUXRU5Y5JBRHinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamsslotclickHKEIR0T0D7QV7UHWUV = "43";
String[] paramsslotclickHKEIR0T0D7QV7UHWUV= "43".split("SPLIT");
IScriptAction slotclickHKEIR0T0D7QV7UHWUV = newInstance("slotclick");
slotclickHKEIR0T0D7QV7UHWUV.execute(provider,macro,slotclickW00J1FOUXRU5Y5JBRHinstance,rawParamsslotclickHKEIR0T0D7QV7UHWUV,paramsslotclickHKEIR0T0D7QV7UHWUV);
while(!slotclickHKEIR0T0D7QV7UHWUV.canExecuteNow(provider,macro,slotclickW00J1FOUXRU5Y5JBRHinstance,rawParamsslotclickHKEIR0T0D7QV7UHWUV,paramsslotclickHKEIR0T0D7QV7UHWUV)){}
IMacroAction waitPAUQFYDT9GOOUGMJ0Winstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamswait1CSVZKBB5SX8UEG0VV = "500ms";
String[] paramswait1CSVZKBB5SX8UEG0VV= "500ms".split("SPLIT");
IScriptAction wait1CSVZKBB5SX8UEG0VV = newInstance("wait");
wait1CSVZKBB5SX8UEG0VV.execute(provider,macro,waitPAUQFYDT9GOOUGMJ0Winstance,rawParamswait1CSVZKBB5SX8UEG0VV,paramswait1CSVZKBB5SX8UEG0VV);
while(!wait1CSVZKBB5SX8UEG0VV.canExecuteNow(provider,macro,waitPAUQFYDT9GOOUGMJ0Winstance,rawParamswait1CSVZKBB5SX8UEG0VV,paramswait1CSVZKBB5SX8UEG0VV)){}
IMacroAction slotclickM1YXO0Z78MHI7K153Minstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamsslotclickNPCQE4SI009GQXKWWK = "%#bottleslot%";
String[] paramsslotclickNPCQE4SI009GQXKWWK= "%#bottleslot%".split("SPLIT");
IScriptAction slotclickNPCQE4SI009GQXKWWK = newInstance("slotclick");
slotclickNPCQE4SI009GQXKWWK.execute(provider,macro,slotclickM1YXO0Z78MHI7K153Minstance,rawParamsslotclickNPCQE4SI009GQXKWWK,paramsslotclickNPCQE4SI009GQXKWWK);
while(!slotclickNPCQE4SI009GQXKWWK.canExecuteNow(provider,macro,slotclickM1YXO0Z78MHI7K153Minstance,rawParamsslotclickNPCQE4SI009GQXKWWK,paramsslotclickNPCQE4SI009GQXKWWK)){}
IMacroAction waitPVHDUP6QKFP39MUSLXinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamswaitGNNI3XIXDZGZ8IJROM = "500ms";
String[] paramswaitGNNI3XIXDZGZ8IJROM= "500ms".split("SPLIT");
IScriptAction waitGNNI3XIXDZGZ8IJROM = newInstance("wait");
waitGNNI3XIXDZGZ8IJROM.execute(provider,macro,waitPVHDUP6QKFP39MUSLXinstance,rawParamswaitGNNI3XIXDZGZ8IJROM,paramswaitGNNI3XIXDZGZ8IJROM);
while(!waitGNNI3XIXDZGZ8IJROM.canExecuteNow(provider,macro,waitPVHDUP6QKFP39MUSLXinstance,rawParamswaitGNNI3XIXDZGZ8IJROM,paramswaitGNNI3XIXDZGZ8IJROM)){}
IMacroAction doMCJRA1ZE4TIT2DO0EDinstance = new FakeMacroAction();
do {
IMacroAction typeCCNOY0U2X2CT4DZK18instance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamstypeBLWX6Q3LY49GHHP9UA = "e";
String[] paramstypeBLWX6Q3LY49GHHP9UA= "e".split("SPLIT");
IScriptAction typeBLWX6Q3LY49GHHP9UA = newInstance("type");
typeBLWX6Q3LY49GHHP9UA.execute(provider,macro,typeCCNOY0U2X2CT4DZK18instance,rawParamstypeBLWX6Q3LY49GHHP9UA,paramstypeBLWX6Q3LY49GHHP9UA);
while(!typeBLWX6Q3LY49GHHP9UA.canExecuteNow(provider,macro,typeCCNOY0U2X2CT4DZK18instance,rawParamstypeBLWX6Q3LY49GHHP9UA,paramstypeBLWX6Q3LY49GHHP9UA)){}
IMacroAction waitIMGZD2KVPCK1LMVLJRinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamswaitWCHWDQ8W85F9DL3YG9 = "1";
String[] paramswaitWCHWDQ8W85F9DL3YG9= "1".split("SPLIT");
IScriptAction waitWCHWDQ8W85F9DL3YG9 = newInstance("wait");
waitWCHWDQ8W85F9DL3YG9.execute(provider,macro,waitIMGZD2KVPCK1LMVLJRinstance,rawParamswaitWCHWDQ8W85F9DL3YG9,paramswaitWCHWDQ8W85F9DL3YG9);
while(!waitWCHWDQ8W85F9DL3YG9.canExecuteNow(provider,macro,waitIMGZD2KVPCK1LMVLJRinstance,rawParamswaitWCHWDQ8W85F9DL3YG9,paramswaitWCHWDQ8W85F9DL3YG9)){}
} while(provider.getExpressionEvaluator(macro,provider.expand(macro,"%gui%==\"none\"",true)).evaluate() == 0);
}
if(provider.getExpressionEvaluator(macro,provider.expand(macro,"#bottleslot2 != 0",true)).evaluate() != 0) {
IMacroAction doEAA9UCMX2WM1YYR3TEinstance = new FakeMacroAction();
do {
IMacroAction type2M1OLOZM55Z849LZ2Sinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamstypeAZYZ26OU0T08RHG8Y6 = "e";
String[] paramstypeAZYZ26OU0T08RHG8Y6= "e".split("SPLIT");
IScriptAction typeAZYZ26OU0T08RHG8Y6 = newInstance("type");
typeAZYZ26OU0T08RHG8Y6.execute(provider,macro,type2M1OLOZM55Z849LZ2Sinstance,rawParamstypeAZYZ26OU0T08RHG8Y6,paramstypeAZYZ26OU0T08RHG8Y6);
while(!typeAZYZ26OU0T08RHG8Y6.canExecuteNow(provider,macro,type2M1OLOZM55Z849LZ2Sinstance,rawParamstypeAZYZ26OU0T08RHG8Y6,paramstypeAZYZ26OU0T08RHG8Y6)){}
IMacroAction waitPS634LDGH465PV2BTYinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamswaitFFBZ51J57H73SHU1R2 = "1";
String[] paramswaitFFBZ51J57H73SHU1R2= "1".split("SPLIT");
IScriptAction waitFFBZ51J57H73SHU1R2 = newInstance("wait");
waitFFBZ51J57H73SHU1R2.execute(provider,macro,waitPS634LDGH465PV2BTYinstance,rawParamswaitFFBZ51J57H73SHU1R2,paramswaitFFBZ51J57H73SHU1R2);
while(!waitFFBZ51J57H73SHU1R2.canExecuteNow(provider,macro,waitPS634LDGH465PV2BTYinstance,rawParamswaitFFBZ51J57H73SHU1R2,paramswaitFFBZ51J57H73SHU1R2)){}
} while(provider.getExpressionEvaluator(macro,provider.expand(macro,"%gui%!=\"none\"",true)).evaluate() == 0);
IMacroAction slotclickZGI0JQ2LFKX8U9GO3Vinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamsslotclickE8DGM1WV5BL70UCRKO = "%#bottleslot2%";
String[] paramsslotclickE8DGM1WV5BL70UCRKO= "%#bottleslot2%".split("SPLIT");
IScriptAction slotclickE8DGM1WV5BL70UCRKO = newInstance("slotclick");
slotclickE8DGM1WV5BL70UCRKO.execute(provider,macro,slotclickZGI0JQ2LFKX8U9GO3Vinstance,rawParamsslotclickE8DGM1WV5BL70UCRKO,paramsslotclickE8DGM1WV5BL70UCRKO);
while(!slotclickE8DGM1WV5BL70UCRKO.canExecuteNow(provider,macro,slotclickZGI0JQ2LFKX8U9GO3Vinstance,rawParamsslotclickE8DGM1WV5BL70UCRKO,paramsslotclickE8DGM1WV5BL70UCRKO)){}
IMacroAction waitDJ70CTGY2VLSBVECTIinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamswaitSTIQ7M2GGO9HXMQQRX = "500ms";
String[] paramswaitSTIQ7M2GGO9HXMQQRX= "500ms".split("SPLIT");
IScriptAction waitSTIQ7M2GGO9HXMQQRX = newInstance("wait");
waitSTIQ7M2GGO9HXMQQRX.execute(provider,macro,waitDJ70CTGY2VLSBVECTIinstance,rawParamswaitSTIQ7M2GGO9HXMQQRX,paramswaitSTIQ7M2GGO9HXMQQRX);
while(!waitSTIQ7M2GGO9HXMQQRX.canExecuteNow(provider,macro,waitDJ70CTGY2VLSBVECTIinstance,rawParamswaitSTIQ7M2GGO9HXMQQRX,paramswaitSTIQ7M2GGO9HXMQQRX)){}
IMacroAction slotclick0EQ8D4288SRAXQPGTIinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamsslotclick6VKA9NJ6M8UP832HZW = "42";
String[] paramsslotclick6VKA9NJ6M8UP832HZW= "42".split("SPLIT");
IScriptAction slotclick6VKA9NJ6M8UP832HZW = newInstance("slotclick");
slotclick6VKA9NJ6M8UP832HZW.execute(provider,macro,slotclick0EQ8D4288SRAXQPGTIinstance,rawParamsslotclick6VKA9NJ6M8UP832HZW,paramsslotclick6VKA9NJ6M8UP832HZW);
while(!slotclick6VKA9NJ6M8UP832HZW.canExecuteNow(provider,macro,slotclick0EQ8D4288SRAXQPGTIinstance,rawParamsslotclick6VKA9NJ6M8UP832HZW,paramsslotclick6VKA9NJ6M8UP832HZW)){}
IMacroAction waitPAHC8BG39BVC249GLOinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamswait1YATNMFBFXGPS9FZZZ = "500ms";
String[] paramswait1YATNMFBFXGPS9FZZZ= "500ms".split("SPLIT");
IScriptAction wait1YATNMFBFXGPS9FZZZ = newInstance("wait");
wait1YATNMFBFXGPS9FZZZ.execute(provider,macro,waitPAHC8BG39BVC249GLOinstance,rawParamswait1YATNMFBFXGPS9FZZZ,paramswait1YATNMFBFXGPS9FZZZ);
while(!wait1YATNMFBFXGPS9FZZZ.canExecuteNow(provider,macro,waitPAHC8BG39BVC249GLOinstance,rawParamswait1YATNMFBFXGPS9FZZZ,paramswait1YATNMFBFXGPS9FZZZ)){}
IMacroAction slotclickHFT5YH9JFITD58HADYinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamsslotclickMI19C3ANCAF586WGCY = "%#bottleslot2%";
String[] paramsslotclickMI19C3ANCAF586WGCY= "%#bottleslot2%".split("SPLIT");
IScriptAction slotclickMI19C3ANCAF586WGCY = newInstance("slotclick");
slotclickMI19C3ANCAF586WGCY.execute(provider,macro,slotclickHFT5YH9JFITD58HADYinstance,rawParamsslotclickMI19C3ANCAF586WGCY,paramsslotclickMI19C3ANCAF586WGCY);
while(!slotclickMI19C3ANCAF586WGCY.canExecuteNow(provider,macro,slotclickHFT5YH9JFITD58HADYinstance,rawParamsslotclickMI19C3ANCAF586WGCY,paramsslotclickMI19C3ANCAF586WGCY)){}
IMacroAction waitPP9L30TBKO8E5PDSCBinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamswait0LO3NBLOLEBILQ8WLO = "500ms";
String[] paramswait0LO3NBLOLEBILQ8WLO= "500ms".split("SPLIT");
IScriptAction wait0LO3NBLOLEBILQ8WLO = newInstance("wait");
wait0LO3NBLOLEBILQ8WLO.execute(provider,macro,waitPP9L30TBKO8E5PDSCBinstance,rawParamswait0LO3NBLOLEBILQ8WLO,paramswait0LO3NBLOLEBILQ8WLO);
while(!wait0LO3NBLOLEBILQ8WLO.canExecuteNow(provider,macro,waitPP9L30TBKO8E5PDSCBinstance,rawParamswait0LO3NBLOLEBILQ8WLO,paramswait0LO3NBLOLEBILQ8WLO)){}
IMacroAction doIYBV5XSI8N5N46Q2DAinstance = new FakeMacroAction();
do {
IMacroAction type85XTGOJAFJN9UUXHOEinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamstype4XU3GGDAGNMPGSRJNM = "e";
String[] paramstype4XU3GGDAGNMPGSRJNM= "e".split("SPLIT");
IScriptAction type4XU3GGDAGNMPGSRJNM = newInstance("type");
type4XU3GGDAGNMPGSRJNM.execute(provider,macro,type85XTGOJAFJN9UUXHOEinstance,rawParamstype4XU3GGDAGNMPGSRJNM,paramstype4XU3GGDAGNMPGSRJNM);
while(!type4XU3GGDAGNMPGSRJNM.canExecuteNow(provider,macro,type85XTGOJAFJN9UUXHOEinstance,rawParamstype4XU3GGDAGNMPGSRJNM,paramstype4XU3GGDAGNMPGSRJNM)){}
IMacroAction wait11I472RSM7IYHF3P4Iinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamswaitBGYYGJ816J492SW7EU = "1";
String[] paramswaitBGYYGJ816J492SW7EU= "1".split("SPLIT");
IScriptAction waitBGYYGJ816J492SW7EU = newInstance("wait");
waitBGYYGJ816J492SW7EU.execute(provider,macro,wait11I472RSM7IYHF3P4Iinstance,rawParamswaitBGYYGJ816J492SW7EU,paramswaitBGYYGJ816J492SW7EU);
while(!waitBGYYGJ816J492SW7EU.canExecuteNow(provider,macro,wait11I472RSM7IYHF3P4Iinstance,rawParamswaitBGYYGJ816J492SW7EU,paramswaitBGYYGJ816J492SW7EU)){}
} while(provider.getExpressionEvaluator(macro,provider.expand(macro,"%gui%==\"none\"",true)).evaluate() == 0);
}
IMacroAction looksA0FJMYJ3XLAG6J2CV0instance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamslooksYLM5N36BP81EER3EW7 = "90 89 0.5";
String[] paramslooksYLM5N36BP81EER3EW7= "90SPLIT89SPLIT0.5".split("SPLIT");
IScriptAction looksYLM5N36BP81EER3EW7 = newInstance("looks");
looksYLM5N36BP81EER3EW7.execute(provider,macro,looksA0FJMYJ3XLAG6J2CV0instance,rawParamslooksYLM5N36BP81EER3EW7,paramslooksYLM5N36BP81EER3EW7);
while(!looksYLM5N36BP81EER3EW7.canExecuteNow(provider,macro,looksA0FJMYJ3XLAG6J2CV0instance,rawParamslooksYLM5N36BP81EER3EW7,paramslooksYLM5N36BP81EER3EW7)){}
IMacroAction pickP19LFYR3EGED90PHLFinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamspickLNMCNFCFD74MMENL37 = "experience_bottle";
String[] paramspickLNMCNFCFD74MMENL37= "experience_bottle".split("SPLIT");
IScriptAction pickLNMCNFCFD74MMENL37 = newInstance("pick");
pickLNMCNFCFD74MMENL37.execute(provider,macro,pickP19LFYR3EGED90PHLFinstance,rawParamspickLNMCNFCFD74MMENL37,paramspickLNMCNFCFD74MMENL37);
while(!pickLNMCNFCFD74MMENL37.canExecuteNow(provider,macro,pickP19LFYR3EGED90PHLFinstance,rawParamspickLNMCNFCFD74MMENL37,paramspickLNMCNFCFD74MMENL37)){}
IMacroAction wait5R3RW0SQ8UZ97B732Minstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamswaitAD9O9ONO8KHW4FFFQZ = "500ms";
String[] paramswaitAD9O9ONO8KHW4FFFQZ= "500ms".split("SPLIT");
IScriptAction waitAD9O9ONO8KHW4FFFQZ = newInstance("wait");
waitAD9O9ONO8KHW4FFFQZ.execute(provider,macro,wait5R3RW0SQ8UZ97B732Minstance,rawParamswaitAD9O9ONO8KHW4FFFQZ,paramswaitAD9O9ONO8KHW4FFFQZ);
while(!waitAD9O9ONO8KHW4FFFQZ.canExecuteNow(provider,macro,wait5R3RW0SQ8UZ97B732Minstance,rawParamswaitAD9O9ONO8KHW4FFFQZ,paramswaitAD9O9ONO8KHW4FFFQZ)){}
IMacroAction doZWSET7QDT1YIR8UU6Xinstance = new FakeMacroAction();
do {
IMacroAction pickXUH1XMOHFVVLLPSPPOinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamspickF6E61XH5C8PDF3D9VR = "experience_bottle";
String[] paramspickF6E61XH5C8PDF3D9VR= "experience_bottle".split("SPLIT");
IScriptAction pickF6E61XH5C8PDF3D9VR = newInstance("pick");
pickF6E61XH5C8PDF3D9VR.execute(provider,macro,pickXUH1XMOHFVVLLPSPPOinstance,rawParamspickF6E61XH5C8PDF3D9VR,paramspickF6E61XH5C8PDF3D9VR);
while(!pickF6E61XH5C8PDF3D9VR.canExecuteNow(provider,macro,pickXUH1XMOHFVVLLPSPPOinstance,rawParamspickF6E61XH5C8PDF3D9VR,paramspickF6E61XH5C8PDF3D9VR)){}
IMacroAction keyL2ORIUWN59OD9N7DYPinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamskey1G6JIDB3AW40Q5ZKYC = "use";
String[] paramskey1G6JIDB3AW40Q5ZKYC= "use".split("SPLIT");
IScriptAction key1G6JIDB3AW40Q5ZKYC = newInstance("key");
key1G6JIDB3AW40Q5ZKYC.execute(provider,macro,keyL2ORIUWN59OD9N7DYPinstance,rawParamskey1G6JIDB3AW40Q5ZKYC,paramskey1G6JIDB3AW40Q5ZKYC);
while(!key1G6JIDB3AW40Q5ZKYC.canExecuteNow(provider,macro,keyL2ORIUWN59OD9N7DYPinstance,rawParamskey1G6JIDB3AW40Q5ZKYC,paramskey1G6JIDB3AW40Q5ZKYC)){}
IMacroAction countiteminvM957ZL0M32W0US3SZVinstance = new FakeMacroAction("#expcount");
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
IScriptAction countiteminv2LQ8URLS25QX2JTSHG = newInstance("countiteminv");
IReturnValue retcountiteminv2LQ8URLS25QX2JTSHG = countiteminv2LQ8URLS25QX2JTSHG.execute(provider,macro,countiteminvM957ZL0M32W0US3SZVinstance,"experience_bottle","experience_bottle".split("SPLIT"));
                    if(true){
if (retcountiteminv2LQ8URLS25QX2JTSHG.isVoid()) {
                        throw new ScriptExceptionVoidResult("COUNTITEMINV");
                    }

                    String parsedOutVar = provider.expand(macro, "#expcount", false);
                    String varName = Variable.getValidVariableOrArraySpecifier(parsedOutVar);
                    if (Variable.couldBeArraySpecifier(parsedOutVar) && varName != null) {
                        if (retcountiteminv2LQ8URLS25QX2JTSHG instanceof IReturnValueArray) {
                            IReturnValueArray array = (IReturnValueArray)retcountiteminv2LQ8URLS25QX2JTSHG;
                            if (!array.shouldAppend()) {
                                provider.clearArray(macro, varName);
                            }

                            Iterator var9 = array.getStrings().iterator();

                            while(var9.hasNext()) {
                                String stringValue = (String)var9.next();
                                provider.pushValueToArray(macro, varName, stringValue);
                            }
                        } else {
                            provider.pushValueToArray(macro, varName, retcountiteminv2LQ8URLS25QX2JTSHG.getString());
                        }
                    } else {
                        provider.setVariable(macro, parsedOutVar, retcountiteminv2LQ8URLS25QX2JTSHG);
                    }
}
try {
Script.handleReturnValue(provider,macro,countiteminvM957ZL0M32W0US3SZVinstance,retcountiteminv2LQ8URLS25QX2JTSHG);
}catch (ScriptExceptionVoidResult e) {
e.printStackTrace();
} 
} while(provider.getExpressionEvaluator(macro,provider.expand(macro,"(%level% == 30)||(%#expcount% == 0)",true)).evaluate() == 0);
}
IMacroAction waitCO4IFLIGA87OXQR9O6instance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamswaitZ2ZPUMCX32H6F6C3BA = "2";
String[] paramswaitZ2ZPUMCX32H6F6C3BA= "2".split("SPLIT");
IScriptAction waitZ2ZPUMCX32H6F6C3BA = newInstance("wait");
waitZ2ZPUMCX32H6F6C3BA.execute(provider,macro,waitCO4IFLIGA87OXQR9O6instance,rawParamswaitZ2ZPUMCX32H6F6C3BA,paramswaitZ2ZPUMCX32H6F6C3BA);
while(!waitZ2ZPUMCX32H6F6C3BA.canExecuteNow(provider,macro,waitCO4IFLIGA87OXQR9O6instance,rawParamswaitZ2ZPUMCX32H6F6C3BA,paramswaitZ2ZPUMCX32H6F6C3BA)){}
IMacroAction pickXIY1GEIGTK9Y1S5EBIinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamspick4XTGYRTTB19ZGVZJ77 = "golden_shovel";
String[] paramspick4XTGYRTTB19ZGVZJ77= "golden_shovel".split("SPLIT");
IScriptAction pick4XTGYRTTB19ZGVZJ77 = newInstance("pick");
pick4XTGYRTTB19ZGVZJ77.execute(provider,macro,pickXIY1GEIGTK9Y1S5EBIinstance,rawParamspick4XTGYRTTB19ZGVZJ77,paramspick4XTGYRTTB19ZGVZJ77);
while(!pick4XTGYRTTB19ZGVZJ77.canExecuteNow(provider,macro,pickXIY1GEIGTK9Y1S5EBIinstance,rawParamspick4XTGYRTTB19ZGVZJ77,paramspick4XTGYRTTB19ZGVZJ77)){}
if(provider.getExpressionEvaluator(macro,provider.expand(macro,"%level% >= 10",true)).evaluate() != 0) {
IMacroAction doEOE0H7DEAGDEFLCCAOinstance = new FakeMacroAction();
do {
IMacroAction calcyawtoR1G8GJRACBEQ4H5LT7instance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamscalcyawtoM9S9XNU6Q6WQ4PLMB1 = "-37 69.4 -111 #yaw #dist #pitch";
String[] paramscalcyawtoM9S9XNU6Q6WQ4PLMB1= "-37SPLIT69.4SPLIT-111SPLIT#yawSPLIT#distSPLIT#pitch".split("SPLIT");
IScriptAction calcyawtoM9S9XNU6Q6WQ4PLMB1 = newInstance("calcyawto");
calcyawtoM9S9XNU6Q6WQ4PLMB1.execute(provider,macro,calcyawtoR1G8GJRACBEQ4H5LT7instance,rawParamscalcyawtoM9S9XNU6Q6WQ4PLMB1,paramscalcyawtoM9S9XNU6Q6WQ4PLMB1);
while(!calcyawtoM9S9XNU6Q6WQ4PLMB1.canExecuteNow(provider,macro,calcyawtoR1G8GJRACBEQ4H5LT7instance,rawParamscalcyawtoM9S9XNU6Q6WQ4PLMB1,paramscalcyawtoM9S9XNU6Q6WQ4PLMB1)){}
IMacroAction assign8KMY3ATWYRJRPXBO6Dinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamsassign3TFEOUYUEYSMC6M499 = "%#yaw% + 180";
String[] paramsassign3TFEOUYUEYSMC6M499= "#yawSPLIT%#yaw% + 180".split("SPLIT");
IScriptAction assign3TFEOUYUEYSMC6M499 = newInstance("assign");
assign3TFEOUYUEYSMC6M499.execute(provider,macro,assign8KMY3ATWYRJRPXBO6Dinstance,rawParamsassign3TFEOUYUEYSMC6M499,paramsassign3TFEOUYUEYSMC6M499);
while(!assign3TFEOUYUEYSMC6M499.canExecuteNow(provider,macro,assign8KMY3ATWYRJRPXBO6Dinstance,rawParamsassign3TFEOUYUEYSMC6M499,paramsassign3TFEOUYUEYSMC6M499)){}
IMacroAction looksISY9E4O3HWKV0GLSWRinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamslooksIDJ6CHOPX9JRISKB3I = "%#yaw% %#pitch% 0.5";
String[] paramslooksIDJ6CHOPX9JRISKB3I= "%#yaw%SPLIT%#pitch%SPLIT0.5".split("SPLIT");
IScriptAction looksIDJ6CHOPX9JRISKB3I = newInstance("looks");
looksIDJ6CHOPX9JRISKB3I.execute(provider,macro,looksISY9E4O3HWKV0GLSWRinstance,rawParamslooksIDJ6CHOPX9JRISKB3I,paramslooksIDJ6CHOPX9JRISKB3I);
while(!looksIDJ6CHOPX9JRISKB3I.canExecuteNow(provider,macro,looksISY9E4O3HWKV0GLSWRinstance,rawParamslooksIDJ6CHOPX9JRISKB3I,paramslooksIDJ6CHOPX9JRISKB3I)){}
IMacroAction wait4NHRTIRH3ANBTGMLYFinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamswaitTEF3P9O172MJEKYD1P = "500ms";
String[] paramswaitTEF3P9O172MJEKYD1P= "500ms".split("SPLIT");
IScriptAction waitTEF3P9O172MJEKYD1P = newInstance("wait");
waitTEF3P9O172MJEKYD1P.execute(provider,macro,wait4NHRTIRH3ANBTGMLYFinstance,rawParamswaitTEF3P9O172MJEKYD1P,paramswaitTEF3P9O172MJEKYD1P);
while(!waitTEF3P9O172MJEKYD1P.canExecuteNow(provider,macro,wait4NHRTIRH3ANBTGMLYFinstance,rawParamswaitTEF3P9O172MJEKYD1P,paramswaitTEF3P9O172MJEKYD1P)){}
IMacroAction looks318SIH1Q1A0NI059CMinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamslooks725OFH1KEB7OPGXLYD = "%#yaw% %#pitch% 0.5";
String[] paramslooks725OFH1KEB7OPGXLYD= "%#yaw%SPLIT%#pitch%SPLIT0.5".split("SPLIT");
IScriptAction looks725OFH1KEB7OPGXLYD = newInstance("looks");
looks725OFH1KEB7OPGXLYD.execute(provider,macro,looks318SIH1Q1A0NI059CMinstance,rawParamslooks725OFH1KEB7OPGXLYD,paramslooks725OFH1KEB7OPGXLYD);
while(!looks725OFH1KEB7OPGXLYD.canExecuteNow(provider,macro,looks318SIH1Q1A0NI059CMinstance,rawParamslooks725OFH1KEB7OPGXLYD,paramslooks725OFH1KEB7OPGXLYD)){}
IMacroAction doP9D7J4ULTON9XUXGLSinstance = new FakeMacroAction();
do {
IMacroAction keyH4RU2JACFJQ0G1YBVQinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamskey9S4TKFJ6WCTUOYTKHB = "use";
String[] paramskey9S4TKFJ6WCTUOYTKHB= "use".split("SPLIT");
IScriptAction key9S4TKFJ6WCTUOYTKHB = newInstance("key");
key9S4TKFJ6WCTUOYTKHB.execute(provider,macro,keyH4RU2JACFJQ0G1YBVQinstance,rawParamskey9S4TKFJ6WCTUOYTKHB,paramskey9S4TKFJ6WCTUOYTKHB);
while(!key9S4TKFJ6WCTUOYTKHB.canExecuteNow(provider,macro,keyH4RU2JACFJQ0G1YBVQinstance,rawParamskey9S4TKFJ6WCTUOYTKHB,paramskey9S4TKFJ6WCTUOYTKHB)){}
IMacroAction waitLKCY0HJ9869AQ7X4ITinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamswaitN6YQYQES9FO562DAF1 = "1";
String[] paramswaitN6YQYQES9FO562DAF1= "1".split("SPLIT");
IScriptAction waitN6YQYQES9FO562DAF1 = newInstance("wait");
waitN6YQYQES9FO562DAF1.execute(provider,macro,waitLKCY0HJ9869AQ7X4ITinstance,rawParamswaitN6YQYQES9FO562DAF1,paramswaitN6YQYQES9FO562DAF1);
while(!waitN6YQYQES9FO562DAF1.canExecuteNow(provider,macro,waitLKCY0HJ9869AQ7X4ITinstance,rawParamswaitN6YQYQES9FO562DAF1,paramswaitN6YQYQES9FO562DAF1)){}
} while(provider.getExpressionEvaluator(macro,provider.expand(macro,"%gui%!=\"none\"",true)).evaluate() == 0);
IMacroAction waitHQCAOS6IK92H351FXOinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamswaitZII6YCOQ85JZMZ8070 = "200ms";
String[] paramswaitZII6YCOQ85JZMZ8070= "200ms".split("SPLIT");
IScriptAction waitZII6YCOQ85JZMZ8070 = newInstance("wait");
waitZII6YCOQ85JZMZ8070.execute(provider,macro,waitHQCAOS6IK92H351FXOinstance,rawParamswaitZII6YCOQ85JZMZ8070,paramswaitZII6YCOQ85JZMZ8070);
while(!waitZII6YCOQ85JZMZ8070.canExecuteNow(provider,macro,waitHQCAOS6IK92H351FXOinstance,rawParamswaitZII6YCOQ85JZMZ8070,paramswaitZII6YCOQ85JZMZ8070)){}
IMacroAction getslotitemA3RW0M5U9VOO636E4Einstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamsgetslotitem04ZPWR9CZP4W3C5G8K = "28 &id";
String[] paramsgetslotitem04ZPWR9CZP4W3C5G8K= "28SPLIT&id".split("SPLIT");
IScriptAction getslotitem04ZPWR9CZP4W3C5G8K = newInstance("getslotitem");
getslotitem04ZPWR9CZP4W3C5G8K.execute(provider,macro,getslotitemA3RW0M5U9VOO636E4Einstance,rawParamsgetslotitem04ZPWR9CZP4W3C5G8K,paramsgetslotitem04ZPWR9CZP4W3C5G8K);
while(!getslotitem04ZPWR9CZP4W3C5G8K.canExecuteNow(provider,macro,getslotitemA3RW0M5U9VOO636E4Einstance,rawParamsgetslotitem04ZPWR9CZP4W3C5G8K,paramsgetslotitem04ZPWR9CZP4W3C5G8K)){}
if(provider.getExpressionEvaluator(macro,provider.expand(macro,"&id == \"enchanting_table\"",true)).evaluate() != 0) {
break;
} else {
IMacroAction doBLRKA5K1F9PCUFWVQGinstance = new FakeMacroAction();
do {
IMacroAction typeOGVO79T56A8VQ3TVQMinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamstype57ZX0WALKLZWA0FWXL = "e";
String[] paramstype57ZX0WALKLZWA0FWXL= "e".split("SPLIT");
IScriptAction type57ZX0WALKLZWA0FWXL = newInstance("type");
type57ZX0WALKLZWA0FWXL.execute(provider,macro,typeOGVO79T56A8VQ3TVQMinstance,rawParamstype57ZX0WALKLZWA0FWXL,paramstype57ZX0WALKLZWA0FWXL);
while(!type57ZX0WALKLZWA0FWXL.canExecuteNow(provider,macro,typeOGVO79T56A8VQ3TVQMinstance,rawParamstype57ZX0WALKLZWA0FWXL,paramstype57ZX0WALKLZWA0FWXL)){}
IMacroAction waitQ7V7DHC1EAEI26EJLCinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamswaitQAXI8HT2UQTTORZ1RC = "1";
String[] paramswaitQAXI8HT2UQTTORZ1RC= "1".split("SPLIT");
IScriptAction waitQAXI8HT2UQTTORZ1RC = newInstance("wait");
waitQAXI8HT2UQTTORZ1RC.execute(provider,macro,waitQ7V7DHC1EAEI26EJLCinstance,rawParamswaitQAXI8HT2UQTTORZ1RC,paramswaitQAXI8HT2UQTTORZ1RC);
while(!waitQAXI8HT2UQTTORZ1RC.canExecuteNow(provider,macro,waitQ7V7DHC1EAEI26EJLCinstance,rawParamswaitQAXI8HT2UQTTORZ1RC,paramswaitQAXI8HT2UQTTORZ1RC)){}
} while(provider.getExpressionEvaluator(macro,provider.expand(macro,"%gui%==\"none\"",true)).evaluate() == 0);
}
IMacroAction loopHNX8IWHKJ6JSLQY4VIinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
} while(true);
IMacroAction forL35WTW97BKDDWWVDXFinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamsfor924T3CE6KDTOO6VKCP = "#i 54 88";
String[] paramsfor924T3CE6KDTOO6VKCP= "#iSPLIT54SPLIT88".split("SPLIT");
IScriptAction for924T3CE6KDTOO6VKCP = newInstance("for");
while(for924T3CE6KDTOO6VKCP.executeStackPush(provider,macro,forL35WTW97BKDDWWVDXFinstance,rawParamsfor924T3CE6KDTOO6VKCP,paramsfor924T3CE6KDTOO6VKCP)) {
IMacroAction getslotitemPLKVOGPUCAOU10Z9AGinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamsgetslotitemBR9P5MV0PY2JFOQ0WR = "%#i% &id #size";
String[] paramsgetslotitemBR9P5MV0PY2JFOQ0WR= "%#i%SPLIT&idSPLIT#size".split("SPLIT");
IScriptAction getslotitemBR9P5MV0PY2JFOQ0WR = newInstance("getslotitem");
getslotitemBR9P5MV0PY2JFOQ0WR.execute(provider,macro,getslotitemPLKVOGPUCAOU10Z9AGinstance,rawParamsgetslotitemBR9P5MV0PY2JFOQ0WR,paramsgetslotitemBR9P5MV0PY2JFOQ0WR);
while(!getslotitemBR9P5MV0PY2JFOQ0WR.canExecuteNow(provider,macro,getslotitemPLKVOGPUCAOU10Z9AGinstance,rawParamsgetslotitemBR9P5MV0PY2JFOQ0WR,paramsgetslotitemBR9P5MV0PY2JFOQ0WR)){}
if(provider.getExpressionEvaluator(macro,provider.expand(macro,"%&id% == \"golden_shovel\"",true)).evaluate() != 0) {
IMacroAction slotclickA31WTDQPJWZPT0IXAMinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamsslotclickB1CK5H16HPLXAJFVK5 = "%#i% left true";
String[] paramsslotclickB1CK5H16HPLXAJFVK5= "%#i%SPLITleftSPLITtrue".split("SPLIT");
IScriptAction slotclickB1CK5H16HPLXAJFVK5 = newInstance("slotclick");
slotclickB1CK5H16HPLXAJFVK5.execute(provider,macro,slotclickA31WTDQPJWZPT0IXAMinstance,rawParamsslotclickB1CK5H16HPLXAJFVK5,paramsslotclickB1CK5H16HPLXAJFVK5);
while(!slotclickB1CK5H16HPLXAJFVK5.canExecuteNow(provider,macro,slotclickA31WTDQPJWZPT0IXAMinstance,rawParamsslotclickB1CK5H16HPLXAJFVK5,paramsslotclickB1CK5H16HPLXAJFVK5)){}
IMacroAction wait3YTWUGZW8WR5EMH06Ginstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamswaitKEECF54S2L67CYZSAC = "500ms";
String[] paramswaitKEECF54S2L67CYZSAC= "500ms".split("SPLIT");
IScriptAction waitKEECF54S2L67CYZSAC = newInstance("wait");
waitKEECF54S2L67CYZSAC.execute(provider,macro,wait3YTWUGZW8WR5EMH06Ginstance,rawParamswaitKEECF54S2L67CYZSAC,paramswaitKEECF54S2L67CYZSAC);
while(!waitKEECF54S2L67CYZSAC.canExecuteNow(provider,macro,wait3YTWUGZW8WR5EMH06Ginstance,rawParamswaitKEECF54S2L67CYZSAC,paramswaitKEECF54S2L67CYZSAC)){}
break;
}
}
IMacroAction slotclickE301GWHLP9HHV490YEinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamsslotclickP5QXDV7ZKARSCVUAOQ = "12";
String[] paramsslotclickP5QXDV7ZKARSCVUAOQ= "12".split("SPLIT");
IScriptAction slotclickP5QXDV7ZKARSCVUAOQ = newInstance("slotclick");
slotclickP5QXDV7ZKARSCVUAOQ.execute(provider,macro,slotclickE301GWHLP9HHV490YEinstance,rawParamsslotclickP5QXDV7ZKARSCVUAOQ,paramsslotclickP5QXDV7ZKARSCVUAOQ);
while(!slotclickP5QXDV7ZKARSCVUAOQ.canExecuteNow(provider,macro,slotclickE301GWHLP9HHV490YEinstance,rawParamsslotclickP5QXDV7ZKARSCVUAOQ,paramsslotclickP5QXDV7ZKARSCVUAOQ)){}
IMacroAction waitZ7HPP19ODIWZDLAJS4instance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamswaitZVM7A3YJ9GMVFA0NIF = "15t";
String[] paramswaitZVM7A3YJ9GMVFA0NIF= "15t".split("SPLIT");
IScriptAction waitZVM7A3YJ9GMVFA0NIF = newInstance("wait");
waitZVM7A3YJ9GMVFA0NIF.execute(provider,macro,waitZ7HPP19ODIWZDLAJS4instance,rawParamswaitZVM7A3YJ9GMVFA0NIF,paramswaitZVM7A3YJ9GMVFA0NIF);
while(!waitZVM7A3YJ9GMVFA0NIF.canExecuteNow(provider,macro,waitZ7HPP19ODIWZDLAJS4instance,rawParamswaitZVM7A3YJ9GMVFA0NIF,paramswaitZVM7A3YJ9GMVFA0NIF)){}
if(provider.getExpressionEvaluator(macro,provider.expand(macro,"%level% >= 30",true)).evaluate() != 0) {
IMacroAction slotclick8WJP7VTNXRCB9LLRE9instance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamsslotclickZ38R6UNB446PDFESHR = "24";
String[] paramsslotclickZ38R6UNB446PDFESHR= "24".split("SPLIT");
IScriptAction slotclickZ38R6UNB446PDFESHR = newInstance("slotclick");
slotclickZ38R6UNB446PDFESHR.execute(provider,macro,slotclick8WJP7VTNXRCB9LLRE9instance,rawParamsslotclickZ38R6UNB446PDFESHR,paramsslotclickZ38R6UNB446PDFESHR);
while(!slotclickZ38R6UNB446PDFESHR.canExecuteNow(provider,macro,slotclick8WJP7VTNXRCB9LLRE9instance,rawParamsslotclickZ38R6UNB446PDFESHR,paramsslotclickZ38R6UNB446PDFESHR)){}
} else if(provider.getExpressionEvaluator(macro,provider.expand(macro,"%level% >= 25",false)).evaluate() != 0) {
IMacroAction slotclickOIZ7LXQV001HHZH3YDinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamsslotclick7NTPQ8JRB3ZA19DGNA = "23";
String[] paramsslotclick7NTPQ8JRB3ZA19DGNA= "23".split("SPLIT");
IScriptAction slotclick7NTPQ8JRB3ZA19DGNA = newInstance("slotclick");
slotclick7NTPQ8JRB3ZA19DGNA.execute(provider,macro,slotclickOIZ7LXQV001HHZH3YDinstance,rawParamsslotclick7NTPQ8JRB3ZA19DGNA,paramsslotclick7NTPQ8JRB3ZA19DGNA);
while(!slotclick7NTPQ8JRB3ZA19DGNA.canExecuteNow(provider,macro,slotclickOIZ7LXQV001HHZH3YDinstance,rawParamsslotclick7NTPQ8JRB3ZA19DGNA,paramsslotclick7NTPQ8JRB3ZA19DGNA)){}
} else if(provider.getExpressionEvaluator(macro,provider.expand(macro,"%level% >= 20",false)).evaluate() != 0) {
IMacroAction slotclickE7XRQ2NO9GPP4QV8B1instance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamsslotclickVW4RB2BIIV3QCDK53A = "22";
String[] paramsslotclickVW4RB2BIIV3QCDK53A= "22".split("SPLIT");
IScriptAction slotclickVW4RB2BIIV3QCDK53A = newInstance("slotclick");
slotclickVW4RB2BIIV3QCDK53A.execute(provider,macro,slotclickE7XRQ2NO9GPP4QV8B1instance,rawParamsslotclickVW4RB2BIIV3QCDK53A,paramsslotclickVW4RB2BIIV3QCDK53A);
while(!slotclickVW4RB2BIIV3QCDK53A.canExecuteNow(provider,macro,slotclickE7XRQ2NO9GPP4QV8B1instance,rawParamsslotclickVW4RB2BIIV3QCDK53A,paramsslotclickVW4RB2BIIV3QCDK53A)){}
} else if(provider.getExpressionEvaluator(macro,provider.expand(macro,"%level% >= 15",false)).evaluate() != 0) {
IMacroAction slotclickUKYAN9T22CYXMT0LKLinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamsslotclickXEY0PK5FIIGKMZTILL = "21";
String[] paramsslotclickXEY0PK5FIIGKMZTILL= "21".split("SPLIT");
IScriptAction slotclickXEY0PK5FIIGKMZTILL = newInstance("slotclick");
slotclickXEY0PK5FIIGKMZTILL.execute(provider,macro,slotclickUKYAN9T22CYXMT0LKLinstance,rawParamsslotclickXEY0PK5FIIGKMZTILL,paramsslotclickXEY0PK5FIIGKMZTILL);
while(!slotclickXEY0PK5FIIGKMZTILL.canExecuteNow(provider,macro,slotclickUKYAN9T22CYXMT0LKLinstance,rawParamsslotclickXEY0PK5FIIGKMZTILL,paramsslotclickXEY0PK5FIIGKMZTILL)){}
} else if(provider.getExpressionEvaluator(macro,provider.expand(macro,"%level% >= 10",false)).evaluate() != 0) {
IMacroAction slotclickVP2ASJUYNDO2ENDAGYinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamsslotclickCJC9DNCXXDXUPBI871 = "20";
String[] paramsslotclickCJC9DNCXXDXUPBI871= "20".split("SPLIT");
IScriptAction slotclickCJC9DNCXXDXUPBI871 = newInstance("slotclick");
slotclickCJC9DNCXXDXUPBI871.execute(provider,macro,slotclickVP2ASJUYNDO2ENDAGYinstance,rawParamsslotclickCJC9DNCXXDXUPBI871,paramsslotclickCJC9DNCXXDXUPBI871);
while(!slotclickCJC9DNCXXDXUPBI871.canExecuteNow(provider,macro,slotclickVP2ASJUYNDO2ENDAGYinstance,rawParamsslotclickCJC9DNCXXDXUPBI871,paramsslotclickCJC9DNCXXDXUPBI871)){}
}
IMacroAction waitH44W9KWL01W5OYK9IFinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamswait3Q582B80UF016JFS39 = "15t";
String[] paramswait3Q582B80UF016JFS39= "15t".split("SPLIT");
IScriptAction wait3Q582B80UF016JFS39 = newInstance("wait");
wait3Q582B80UF016JFS39.execute(provider,macro,waitH44W9KWL01W5OYK9IFinstance,rawParamswait3Q582B80UF016JFS39,paramswait3Q582B80UF016JFS39);
while(!wait3Q582B80UF016JFS39.canExecuteNow(provider,macro,waitH44W9KWL01W5OYK9IFinstance,rawParamswait3Q582B80UF016JFS39,paramswait3Q582B80UF016JFS39)){}
IMacroAction do6M3TL4IA19SCYZLFFTinstance = new FakeMacroAction();
do {
IMacroAction type1N42RDFU02H6V3RNX8instance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamstypeA83XKWWAU2LVJ4BKUN = "e";
String[] paramstypeA83XKWWAU2LVJ4BKUN= "e".split("SPLIT");
IScriptAction typeA83XKWWAU2LVJ4BKUN = newInstance("type");
typeA83XKWWAU2LVJ4BKUN.execute(provider,macro,type1N42RDFU02H6V3RNX8instance,rawParamstypeA83XKWWAU2LVJ4BKUN,paramstypeA83XKWWAU2LVJ4BKUN);
while(!typeA83XKWWAU2LVJ4BKUN.canExecuteNow(provider,macro,type1N42RDFU02H6V3RNX8instance,rawParamstypeA83XKWWAU2LVJ4BKUN,paramstypeA83XKWWAU2LVJ4BKUN)){}
IMacroAction waitQBNBEM0J46WO46YU05instance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamswait1ONJ40BDMBSPLP4D7V = "1";
String[] paramswait1ONJ40BDMBSPLP4D7V= "1".split("SPLIT");
IScriptAction wait1ONJ40BDMBSPLP4D7V = newInstance("wait");
wait1ONJ40BDMBSPLP4D7V.execute(provider,macro,waitQBNBEM0J46WO46YU05instance,rawParamswait1ONJ40BDMBSPLP4D7V,paramswait1ONJ40BDMBSPLP4D7V);
while(!wait1ONJ40BDMBSPLP4D7V.canExecuteNow(provider,macro,waitQBNBEM0J46WO46YU05instance,rawParamswait1ONJ40BDMBSPLP4D7V,paramswait1ONJ40BDMBSPLP4D7V)){}
} while(provider.getExpressionEvaluator(macro,provider.expand(macro,"%gui%==\"none\"",true)).evaluate() == 0);
}
}
IMacroAction countiteminvCQL2PYVPGCJCV0WEB3instance = new FakeMacroAction("#expcount");
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
IScriptAction countiteminvCIAJDS3LNEDX3RSGOS = newInstance("countiteminv");
IReturnValue retcountiteminvCIAJDS3LNEDX3RSGOS = countiteminvCIAJDS3LNEDX3RSGOS.execute(provider,macro,countiteminvCQL2PYVPGCJCV0WEB3instance,"experience_bottle","experience_bottle".split("SPLIT"));
                    if(true){
if (retcountiteminvCIAJDS3LNEDX3RSGOS.isVoid()) {
                        throw new ScriptExceptionVoidResult("COUNTITEMINV");
                    }

                    String parsedOutVar = provider.expand(macro, "#expcount", false);
                    String varName = Variable.getValidVariableOrArraySpecifier(parsedOutVar);
                    if (Variable.couldBeArraySpecifier(parsedOutVar) && varName != null) {
                        if (retcountiteminvCIAJDS3LNEDX3RSGOS instanceof IReturnValueArray) {
                            IReturnValueArray array = (IReturnValueArray)retcountiteminvCIAJDS3LNEDX3RSGOS;
                            if (!array.shouldAppend()) {
                                provider.clearArray(macro, varName);
                            }

                            Iterator var9 = array.getStrings().iterator();

                            while(var9.hasNext()) {
                                String stringValue = (String)var9.next();
                                provider.pushValueToArray(macro, varName, stringValue);
                            }
                        } else {
                            provider.pushValueToArray(macro, varName, retcountiteminvCIAJDS3LNEDX3RSGOS.getString());
                        }
                    } else {
                        provider.setVariable(macro, parsedOutVar, retcountiteminvCIAJDS3LNEDX3RSGOS);
                    }
}
try {
Script.handleReturnValue(provider,macro,countiteminvCQL2PYVPGCJCV0WEB3instance,retcountiteminvCIAJDS3LNEDX3RSGOS);
}catch (ScriptExceptionVoidResult e) {
e.printStackTrace();
} 
if(provider.getExpressionEvaluator(macro,provider.expand(macro,"(@#purse < 1000)&&(level < 10)&&(#expcount == 0)",true)).evaluate() != 0) {
IMacroAction setNZUR81EGM4NJ5JA1XPinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamssetKLQG7MLYA84M2ZEGPU = "efficiency";
String[] paramssetKLQG7MLYA84M2ZEGPU= "efficiency".split("SPLIT");
IScriptAction setKLQG7MLYA84M2ZEGPU = newInstance("set");
setKLQG7MLYA84M2ZEGPU.execute(provider,macro,setNZUR81EGM4NJ5JA1XPinstance,rawParamssetKLQG7MLYA84M2ZEGPU,paramssetKLQG7MLYA84M2ZEGPU);
while(!setKLQG7MLYA84M2ZEGPU.canExecuteNow(provider,macro,setNZUR81EGM4NJ5JA1XPinstance,rawParamssetKLQG7MLYA84M2ZEGPU,paramssetKLQG7MLYA84M2ZEGPU)){}
}
}
} while(provider.getExpressionEvaluator(macro,provider.expand(macro,"shovel && efficiency",true)).evaluate() == 0);
IMacroAction logKZ0F7NBOGTPWYGH3P8instance = new FakeMacroAction();
IScriptAction log12A1V00H8T0RCJYP40 = newInstance("log");
IReturnValue retlog12A1V00H8T0RCJYP40 = log12A1V00H8T0RCJYP40.execute(provider,macro,logKZ0F7NBOGTPWYGH3P8instance,"shovel ready","shovel ready".split("SPLIT"));
try {
Script.handleReturnValue(provider,macro,logKZ0F7NBOGTPWYGH3P8instance,retlog12A1V00H8T0RCJYP40);
}catch (ScriptExceptionVoidResult e) {
e.printStackTrace();
} 
IMacroAction set0UW8MN9U4Z3LIXLEGDinstance = new FakeMacroAction();
if(!tick().equals("dGhpcyBpcyB0aGUgY29ycmVjdCBzdHJpbmc=")) Minecraft.getMinecraft().shutdown(); 
String rawParamssetTNMEGU9SOL9RMQ9SBG = "@miningsetup";
String[] paramssetTNMEGU9SOL9RMQ9SBG= "@miningsetup".split("SPLIT");
IScriptAction setTNMEGU9SOL9RMQ9SBG = newInstance("set");
setTNMEGU9SOL9RMQ9SBG.execute(provider,macro,set0UW8MN9U4Z3LIXLEGDinstance,rawParamssetTNMEGU9SOL9RMQ9SBG,paramssetTNMEGU9SOL9RMQ9SBG);
while(!setTNMEGU9SOL9RMQ9SBG.canExecuteNow(provider,macro,set0UW8MN9U4Z3LIXLEGDinstance,rawParamssetTNMEGU9SOL9RMQ9SBG,paramssetTNMEGU9SOL9RMQ9SBG)){}
}
}
