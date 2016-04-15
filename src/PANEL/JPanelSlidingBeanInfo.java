package PANEL;

import java.awt.Image;
import java.beans.*;
 /**
  * 
  * @author Nelson Castiblanco
  */
 public class JPanelSlidingBeanInfo extends SimpleBeanInfo{
     Image icon;
     Image icon32;
     Image iconM;
     Image icon32M;
     
     public JPanelSlidingBeanInfo(){
         icon = loadImage("/images/1_16.gif");
         icon32 = loadImage("/images/1_32.gif");
         iconM = loadImage("/images/2_16.gif");
         icon32M = loadImage("/images/2_32.gif");
     }
     
     @Override
     public Image getIcon(int i){
         switch(i)
         {
         case 1:
             return icon;
 
         case 2:
             return icon32;
 
         case 3:
             return iconM;
 
         case 4:
             return icon32M;
         }
         return null;
     }
 }