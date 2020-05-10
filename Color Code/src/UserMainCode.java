public class UserMainCode { public static int validateColorCode(String s1) {
int b=0,b1=0;
String s2=s1.substring(1,s1.length());
if(s1.length()==7)
if(s1.charAt(0)=='#')
b1=1;
if(b1==1){
/*for(int i=0;i<s2.length();i++){
char c=s2.charAt(i);
if(c!='#')
{*/
if(s2.matches("[A-F0-9]{1,}"))
b=1;
else
b=-1;
//break;
}
return b;
}
}