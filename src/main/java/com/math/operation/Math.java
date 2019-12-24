package com.math.operation;

public class Math {
	//to check if the number is even or not
	public int even(int n) {
		if(n%2==0)
			return 1;
		else
			return 0; 
	}
	//to get the factorial of the number
	public int factorial(int n){
        int fact=1;
        for(int i=n; i>0; i--)
        {
            fact = fact*i;
        }
        return fact;
	}
	public int palin(int n){
		int rem;
		int rev=0;
		int orig;
		orig=n;
		while(n>0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		if(rev==orig)
			return 1;
		else
			return 0;
	}
	public boolean primeNo(int n){
		boolean flag = true;
		for(int i=2;i<=n/2;i++){
			if(n%i==0)
			{
				flag = false;
				break;
			}
		}
		return flag;
	}
}
