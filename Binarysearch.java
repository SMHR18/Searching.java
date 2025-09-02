import java.util.*;
public class Binarysearch{
	public static void main(String[] args){
int [] array = {12,24,36,44,60};
Scanner s1 = new Scanner(System.in);
System.out.println("Enter the number you are searching");
int target = s1.nextInt();
int si=0;
int li = array.length-1;

int found=-1;
while(si<=li){
int mi=(si+li)/2;
	if(target==array[mi]){
found=mi;
break;
}
else if(target>array[mi]){
si=mi+1;
}
else if(target<array[mi]){
li=mi-1;
}

}
if(found>=0)
System.out.println("Target "+ target +" Found at index "+found);

else {
System.out.println("Target "+ target +" not found");
}
}
}
