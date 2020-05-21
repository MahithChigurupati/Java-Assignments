class UserMainCode{
	public static int validateNumber(String[] s1){ 
		int b =0 ,count,out=0; 
		for(int i=0;i<s1.length;i++){
			String s2 = s1[i];
			if(s2.matches("[0-9.]{1,}"))
			{ 
				count =0; 
				for(int j=0;j<s2.length();j++)
				{
					char c = s2.charAt(j);
					if(c=='.') 
						count++; 
				}
				if(count>1)
					b=1; 
			} 
			else
				b=1;
			}
		
		if(b==0){ 
			out=1; 
			}
		else 
			out=-1;
		return out; 
		}
}