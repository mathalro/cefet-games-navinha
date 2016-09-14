package br.cefetmg.games.util;

import com.badlogic.gdx.math.Circle;
import com.badlogic.gdx.math.Rectangle;
import jdk.internal.cmm.SystemResourcePressureImpl;

import static java.lang.System.exit;

/**
 * Utilitário para verificação de colisão.
 * @author fegemo <coutinho@decom.cefetmg.br>
 */
public class Collision {
   public static final boolean circlesOverlap(Circle c1, Circle c2) {
       double raioDuplo = c1.radius + c2.radius, x1 = c1.x, y1 = c1.y, x2 = c2.x, y2 = c2.y;
       if((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2) < raioDuplo*raioDuplo) {
           return true;
       }else {
           return false;
       }
   }

   public static final boolean rectsOverlap(Rectangle r1, Rectangle r2) {
       //variaveis para facilitar os calculos
       /**
       if (r1.x + r1.width > r2.x && r1.x < r2.x + r2.width &&
               r1.y + r1.height > r2.y && r1.y < r2.y + r2.height) {
           return true;
       }**/
       if (r2.x > r1.x + r1.width || r2.x + r2.width < r1.x ||
               r2.y > r1.y + r1.height || r2.y + r2.height < r1.y)
           return false ;
       return true;
   }
}
