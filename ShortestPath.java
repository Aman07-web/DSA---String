public class ShortestPath {
    public static float shortest(String str1){
     int x=0,y=0;
     for(int i=0; i<str1.length();i++){
       char ch=str1.charAt(i);

       if(ch=='W'){
        x--;
       }
       else if(ch=='N'){
        y++;
       }
       else if(ch=='S'){
        y--;
       }
       else{
        x++;
       }
     }
     int x2=x*x;
     int y2=y*y;
     return (float)Math.sqrt(x2+y2);
    }
    public static void main(String[] args) {
        String str="WNEENESENNN";
        System.out.println(shortest(str));
    }
    
}
