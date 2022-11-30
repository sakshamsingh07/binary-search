import java.util.Scanner; 
public class first_indexAndLastindex 
{
    public static int firstindex(int [] arr , int x)
    {
        int li =0,ri=arr.length-1;
        int fi=-1;
        while(li<=ri)
        {
            int mid =(li+ri)/2;
            if (arr[mid]==x)
            {
                fi=mid;
                ri=mid-1;
            }
            else if (arr[mid]>x)
            {
                ri=mid-1;
            }
            else if (arr[mid]<x)
            {
                li=mid+1;
            }
        }
        return fi;
    }
    public static int lastindex(int [] arr , int x)
    {
        int li =0,ri=arr.length-1;
        int lidx=-1;
        while(li<=ri)
        {
            int mid =(li+ri)/2;
            if (arr[mid]==x)
            {
                lidx=mid;
                li=mid+1;
            }
            else if (arr[mid]>x)
            {
                ri=mid-1;
            }
            else if (arr[mid]<x)
            {
                li=mid+1;
            }
        }
        return lidx;
    }
    public static void main(String[] args)
    {
        Scanner  scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];
        for (int i =0 ; i<arr.length; i++)
        {
            arr[i]=scn.nextInt();
        }
        int x = scn.nextInt();
        // int y = scn.nextInt();
        int first = firstindex(arr,x);
        int last = lastindex(arr,x);
        System.out.println(first);
        System.out.println(last);
    }  
}
