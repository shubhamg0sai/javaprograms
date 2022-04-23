# javaprograms
#include<stdio.h>
#include<math.h>

float func(float x)
{
    return (cos(x)-(3*x)+1); //FUNCTION TO BE SOLVED
}
float func1(float x)
{
	return((cos(x)+1)/3);
}

int main()
{
int i=0,pos=0,n=0;
float x1,x0,x2,x3,d,x;



while(1)
    {
        if (func (i)==0)
            printf("Exact Root Found %d !!!", i );
        if( func (i) * func (i+1)<0)
        {
            pos++;
            break;
        }
        i++;

    }
    if(pos)
    {
        x0=i;
        x1=i+1;
        printf("Range of given function is from %.0f to %.0f\n", x0, x1); //RANGE OF FUNCTION COMES OUT
    }
    else
    {
        printf("SORRY!! Range of the given function NOT FOUND.");
         }
    if(pos)
	{
	    printf("The Calculation Table of Iteration Method:-\n");
	    printf("ITERATION \t xi \t\t  xi+1 \t xi-xi+1 \n");
	    x=(x0+x1)/2.0;
             x2=func1(x);
             x3=func1(x2);
             d=x3-x2;
         
	     for(i=0;;i++)
	    {
	        printf("\n%d \t\t %.4f \t %.4f \t %.4f \n",i+1,x2,x3,d);

	         if((float)fabs(x3-x2)<=0.0001f||fabs(x2-x3)<=0.0001f)
	        break;
	        x=x2;
                 x2=x3;
	        x2=func1(x);
                 x3=func1(x2);
                 d=x3-x2;
	    }
	}
	printf("ROOT OF THE GIVEN EQUATION IS:- %.4f\n",x3);
return 0;
}
