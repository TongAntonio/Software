public class Triangle {

    public boolean equilateral(int a,int b,int c){
        if(a == b && b == c){
            return true;
        }else{
            return false;
        }
    }

    public boolean isosceles(int a,int b,int c){
        boolean result = false;
        if(a == b && b != c){
            result = true;
        }else if(a == c && c != b){
            result = true;
        }else if (b == c && c != a){
            result = true;
        }else{
            result = false;
        }

        return result;
    }

    public boolean scalene(int a,int b,int c){
        if(a != b && b != c && c != a){
            return true;
        }else{
            return false;
        }
    }
}
