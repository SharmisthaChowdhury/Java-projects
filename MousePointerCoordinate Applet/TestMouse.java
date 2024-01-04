import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class TestMouse extends Applet implements MouseMotionListener{
String str;
public void init(){
addMouseMotionListener(this);
str="";
}
public void mouseDragged(MouseEvent m){}
public void mouseMoved(MouseEvent m){
int x=m.getX();
int y=getY();
str="("+String.valueOf(x)+"'"+String.valueOf(y)+")";
repaint();
}
public void paint(Graphics g){
g.drawString(str,100,100);
}
}