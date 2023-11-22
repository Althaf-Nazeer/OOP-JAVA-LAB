import java.util.*;
class GarbageCollection{
    public static void main(String arg[]){
        Runtime r=Runtime.getRuntime();
        long mem1,mem2;
        Integer arr[]=new Integer[1000];
        System.out.println("Total memory"+r.totalMemory());
        mem1=r.freeMemory();
        System.out.println("Free memory before gc"+mem1);
        r.gc();
        System.out.println("Free memory after gc"+mem1);
        for(int i=0;i<1000;i++){
            arr[i]=i;
        }
        mem2=r.freeMemory();
        System.out.println("Free memory after assigning value"+mem2);
        System.out.println("Memory used by allocation"+(mem1-mem2));
        for(int i=0;i<1000;i++){
            arr[i]=null;
        }
        r.gc();
        mem2=r.freeMemory();
        System.out.println("After making null"+mem2);
    }
}
