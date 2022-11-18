//REmove white spaces in a given string without using inbuilt function

package com.xworkz.tasks;
import java.util.*;

public class RemoveSpaceString {
	
	public void usingHasNext(String str)
	{
		String r = "";
		Scanner sc = new Scanner(str);

        while(sc.hasNext()) {
            r += sc.next();
        }
        System.out.println(r);
	}
	public String removeAllSpace(String st)
	{
		String st1=st.replaceAll(" ","");
		return st1;
	}

	public void withoutInbuilt(String st2)
	{
		char[] arr=st2.toCharArray();
		String ws="";
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=' ' && arr[i]!='\t' )
			{
				ws=ws+arr[i];
			}
		}
		System.out.println(ws);
	}
	public static void main(String[] args) {
				RemoveSpaceString rs=new RemoveSpaceString();
				
		
		        String str = "Hello world I am here";
		        rs.usingHasNext(str);
		        System.out.println(rs.removeAllSpace(str));
		        rs.withoutInbuilt(str);
		        

		        
		    }
	}


