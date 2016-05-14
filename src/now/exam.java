package now;

import java.io.*;
import java.util.regex.Pattern;
public class exam
{static public String solve(String[]X)
	{
	  String [] newstring=new String[X.length];
	  String pop="";
	  String res="";
	  int i;
	  int M=0;
	 
	  int j;
	  for(i=0;i<X.length;i++)
	  {
		  
		  if(X[i]=="(")
            {    X[i]="";
			   for( j=i+1;X[j]!=")";j++)
			   {
				   
			       X[i]+=X[j];
			     
			       
				   
				   
			   }
			   
            	  res=exam.Dooperation(X[i]);
                         	  
            	 newstring[M]=res; 
            	  M++;
            	 i=j;
            	  
            }
              else
              {	  
              newstring[M]=X[i];
              M++;
              }
		  
		  
		    
	  }
	   for(int ii=0;ii<newstring.length;ii++)
     	{
     		if(newstring[ii]!=null)
     		  pop+=newstring[ii];
     		
     	}
	   
	   String Final="";
	   String []check=exam.divide(pop);
	   pop="";
	   for(int jj=0;jj<check.length;jj++)
	   {
		   
		   
		 pop+=check[jj];
		   
	   
	   }
	   
	  
	 
	 /*  for(int iii=0;iii<check.length;iii++)
	   {            
		  
		   if(iii+1==check.length)
			   break;
		   
		  
		 
		   if(check[iii]=="-"&check[iii+1].startsWith("-"))
		   { 
			   
			   check[iii]="+"+check[iii+1].substring(1,check[iii+1].length());
			   Final+=check[iii];
			   
			  
			   
		   }
		   else if(check[iii]=="+"&check[iii].startsWith("-"))
		   {
			   
			   check[iii]="-"+check[iii+1].substring(1,check[iii+1].length());
			   
			   Final+=check[iii];
			   
		   }
		   else
		   {
			   
		   Final+=check[iii];
		   }
		  
		   
		   
	   }
	   
	   */
	   String XX=exam.Dooperation(pop);
	   
	 
	   
	   
	   
	  return XX;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
static public String Sqr(String [] X)
{       String [] newstring=new String[X.length];
String pop="";
int i;
int M=0;
	for( i=0;i<X.length;i++)
	{   
		
		if(X[i].startsWith("S"))
		{   
			String XXX=X[i].substring(1, X[i].length());
			
			
			double 	result;
			double a=Double.parseDouble(XXX);
			result=Math.sqrt(a);
			newstring[M]=Double.toString(result);
	         M++;
			
				
		}
			
		else
		{  
		
			newstring[M]=X[i];
			M++;
			 
		}
		
	}
	for(int ii=0;ii<newstring.length;ii++)
	{
		if(newstring[ii]!=null)
		  pop+=newstring[ii];
		
	}
	
     return pop;
		
}

		
	static public String ostwo(String [] X)
{       String [] newstring=new String[X.length];
String pop="";
int i;
int M=0;
	for( i=0;i<X.length;i++)
	{   
		
		if(X[i].endsWith("^"))
		{   
			String [] XX=X[i].split(Pattern.quote("^"));
			double 	result;
			double a=Double.parseDouble(XX[0]);
			result=a*a;
			 if(X[i].startsWith("+"))
   			  newstring[M]="+"+Double.toString(result);
			 else if(X[i].startsWith("-"))
					 newstring[M]="+"+Double.toString(result);
					 
   		  else
   	     newstring[M]=Double.toString(result);
				
				
			
			M++;
			
		}
			
		else
		{  
		
			newstring[M]=X[i];
			M++;
			 
		}
		
	}
	for(int ii=0;ii<newstring.length;ii++)
	{
		if(newstring[ii]!=null)
		  pop+=newstring[ii];
		
	}
	
     return pop;
		
}
   static public  String[]  divide(String m)
	{  
	   int ii=0;
	
	   
	 char []operations=new char[m.length()];
	  String [] nums=new String[100];
	   for(int i=0;i<m.length();i++)
	   {
		   operations[i]=m.charAt(i);
		   
		   if(operations[i]=='/')
		      { if (nums[ii]!=null)
		    	  ii++;
		    	   nums[ii]="/";
		           ii++;
		   
		      }
		   else if(operations[i]=='(')
		      {
			  if (nums[ii]!=null)
				  ii++;
				  nums[ii]="(";
		    	  ii++;
			    
		    	    
		      }
			  else if(operations[i]==')')
		      {
			  if (nums[ii]!=null)
				  ii++;
				  nums[ii]=")";
				  ii++;
				 
		      }
		   else if(operations[i]=='%')
		      { if (nums[ii]!=null)
		    	  ii++;
		    	   nums[ii]="%";
		           ii++;
		         
		      }
		   else if(operations[i]=='S')
		      { if (nums[ii]!=null)
		    	  ii++;
		    	   nums[ii]="S";
		        
		         
		      }
		
		   else if(operations[i]=='*')
		      { if (nums[ii]!=null)
		    	  ii++;
		    	  nums[ii]="*";
		    	  ii++;
			    
		      }
		  else if(operations[i]=='+')
		      {
			  if (nums[ii]!=null)
				  ii++;
				  nums[ii]="+";
				  
				/*  if(operations[i+1]=='-')
				  {
					  nums[ii]="-";
					  ii++;
					 i++;
				  }
				  */
			    
		      }
		 
		  else if(operations[i]=='-')
		      { if (nums[ii]!=null)
		    	  ii++;
		    	  nums[ii]="-";
		    	  /* 
		    	     if(operations[i+1]=='-')
		    	  
				  {
					  nums[ii]="+";
					  ii++;
					  i++; 
				  }
				   */
		    	 
		    	
		      }
		   
		      
	    
			
		  else
		  {
			     if(nums[ii]==null)
				     nums[ii]="";
			  nums[ii]+=m.charAt(i);;
			 
		  }
		   
		   
	   }
	   String [] newone=new String[ii+1];
	   for(int iii=0;iii<ii+1;iii++)
	   {
		   newone[iii]=nums[iii];
	   }
	   return newone;
	
	
	}
static public String div(String [] X)
{       String [] newstring=new String[X.length];
String pop="";
int i;
int M=0;
newstring[M]=X[0];

	for( i=1;i<X.length;i++)
	{   
		
		if(X[i]=="/")
		{
			double a=Double.parseDouble(X[i-1]);
			double b=Double.parseDouble(X[i+1]);
		
			if(X[i-1].startsWith("+"))
	  			  newstring[M]="+"+Double.toString(a/b);
	  		  else
	  	     newstring[M]=Double.toString(a/b);
		     
			 
		         
			 X[i+1]=Double.toString(a/b);
		 
		 i++;
			
			
		}
			
		else
		{ 
			
			   
			if(X[i]!="/"||X[i+1]!="/") 
				M++;
			newstring[M]=X[i];
			
			
			
			
		}
		
	}
	for(int ii=0;ii<newstring.length;ii++)
	{
		if(newstring[ii]!=null)
		  pop+=newstring[ii];
		
	}
	
	
	
     return pop;
		
}
static public String mod(String [] X)
{       String [] newstring=new String[X.length];
String pop="";
int i;
int M=0;
newstring[M]=X[0];

	for( i=1;i<X.length;i++)
	{   
		
		if(X[i]=="%")
		{
			double a=Double.parseDouble(X[i-1]);
			double b=Double.parseDouble(X[i+1]);
		
			
  		  if(X[i-1].startsWith("+"))
  			  newstring[M]="+"+Double.toString(a%b);
  		  else
  	     newstring[M]=Double.toString(a%b);
	     
		 
	         
		 X[i+1]=Double.toString(a%b);
		 
		 i++;
			
			
		}
			
		else
		{ 
			
			   
			if(X[i]!="%"||X[i+1]!="%") 
				M++;
			newstring[M]=X[i];
			
			
			
			
		}
		
	}
	for(int ii=0;ii<newstring.length;ii++)
	{
		if(newstring[ii]!=null)
		  pop+=newstring[ii];
		
	}
	
	
	
     return pop;
		
}
static public String Dooperation(String X)
{  String XXXX=ostwo(divide(X));
   String XXX=Sqr(divide(XXXX));
	String XX=mod(divide(XXX));
  	String C1=div(divide(XX));
  	String C=mul(divide(C1));
  	String CCC=sumandsub(divide(C));
	
	return CCC;


}
    static public String mul(String [] X)
    {       String [] newstring=new String[X.length];
    String pop="";
    int i;
    int M=0;
    newstring[M]=X[0];
    	for( i=1;i<X.length;i++)
    	{   
    		
    		if(X[i]=="*")
    		{   
    			
    				
    				
    				
    			double a=Double.parseDouble(X[i-1]);
    			double b=Double.parseDouble(X[i+1]);
    			
    		  if(X[i-1].startsWith("+"))
    			  newstring[M]="+"+Double.toString(a*b);
    		  else
    	     newstring[M]=Double.toString(a*b);
    		 
    	         
    		 X[i+1]= Double.toString(a*b);
    		 
    		 i++;
    			
    			
    		}
    			
    		else
    		{  
    		
      		  
    			if(X[i]!="*"||X[i+1]!="*")
 			     M++;
    			newstring[M]=X[i];
    			 
    		}
    		
    	}
    	for(int ii=0;ii<newstring.length;ii++)
    	{
    		if(newstring[ii]!=null)
    		  pop+=newstring[ii];
    		
    	}
    	
         return pop;
    		
    }
    static public String sumandsub(String[]X)
    {
    	double x=0;
    	double y=0;
    	for(int i=0;i<X.length;i++)
    	{
    		if(X[i].startsWith("-"))
    			x+=Double.valueOf(X[i]);
    			/*x+=Double.parseDouble(X[i]);*/
    		else
    			y+=Double.valueOf(X[i]);
    			/*y+=Double.parseDouble(X[i]);*/
    		
    		
    		
    	}
    	
    	double z=x+y;
    	String pop=Double.toString(z);
    	return pop;
    	
    	
    	
    }
   
   
    public static void main(String[] args) 
	{
	   
	 String A="10+(20*10)";
	    String[]X=exam.divide(A);
	    
	 
	
	
	    System.out.println(exam.solve(X));
	   
	     
	  
  
		

	}

	

   }
  
 
