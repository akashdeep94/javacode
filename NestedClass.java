class NestedClass{
int x=0;
void  sum(int a, int b){
x= a+b;
System.out.println(x);
}

class inner1{
int p=0;
void mul(int a, int b){

p= a*b;
System.out.println(p);
}

}

public static void main(String[] args){
NestedClass ob = new NestedClass();
NestedClass.inner1 io = ob.new inner1();
io.mul(2,3);
ob.sum(4,5);
NestedClass rf=io;
rf.mul(6,7);
}


}