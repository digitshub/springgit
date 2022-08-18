package Q3;

class foreach{
    public static void main(String args[]){
        int arr[]={1,3,4,5};
        int total=0;
        for(int i:arr){
            total=total+i;
        }
        System.out.println("Total: "+total);
    }
}

