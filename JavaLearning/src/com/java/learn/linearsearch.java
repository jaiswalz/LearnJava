package JavaLearning.src.com.java.learn;

public class linearsearch {
    public static int linearsearch(int array[],int x)
    {
        int n=array.length;
        for(int i=0;i<n;i++)
        {
            if(array[i]==x)
                return i;
        }
         return -1;
    }

    public static void main(String[] args) {
        int array[]={2,4,0,1,9};
        int x=1;
        int result=linearsearch(array,x);
        if(result== -1)
            System.out.print("Element not found");
        else
            System.out.print("Element found at index:"+result);

    }

}
