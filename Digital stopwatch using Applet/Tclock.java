import java.awt.*;

import java.applet.*;

public class Tclock extends Applet implements Runnable{

String str; 
Thread t1;

public void init(){

t1= new Thread(this);
t1.start();
}

public void run(){
int i;
for(i=0;i<=60;i++){
if(i<10)
str="0:0"+String.valueOf(i);
else if(i>=10 && i<60)
str="0:"+String.valueOf(i);
else
str="1:00";
repaint();
try{
t1.sleep(1000);
}
catch(InterruptedException ie){}
}
}
public void paint(Graphics g ){

g.drawString(str,100,100);

} 
}