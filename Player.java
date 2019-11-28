package Blokus;

import java.util.LinkedList;

public class Player
{
   public LinkedList<Pieces> pieces;
   public boolean firstMove = true;
   public boolean canPlay = true;
   
   public Player(int color)
   {
      
      int[][][] shapes = Pieces.getAllShapes();
      
      pieces = new LinkedList<Pieces>();
      
      for (int i = 0; i < shapes.length; i++)
      {
         pieces.add(new Pieces(shapes[i], color));
      }
   }
   
   public int getScore()
   {
      int total = 0;
      for (Pieces bp : pieces)
      {
         total += bp.getPoints();
      }
      return total;
   }
}
