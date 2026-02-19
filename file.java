import java.util.Stack ;
 import java.util.*; 
  public class file {
       ArrayDeque<ArrayDeque<maillon>> F ; 
         
         
         
         //initialiser 
         public file (){
               this.pil=new ArrayDeque<>();
               }
           public void emfiler( maillon m ){
           
                    pile();
                    F.offer(m);
                    }
                    }
            // additionne un maillpn = une case passer 
            public maillon defiler(maillon m ){
                   ArrayList<maillon> m=F.poll();
                   return m;
                   }
                 //on regarde le sommet du pile 
                public E sommet(){
                            ArrayList<maillon> m ;
                        m=F.peek();
                        }
                public boolean isEmpty(){
                       return F.isEmpty;
                       }
                       //la taille de la pile   
                public int  size(){
                   return F.size();
                   }
                 public void clear()
                  {
                     return   F.clear();}
               
         
               
               
               
               
               
               }
