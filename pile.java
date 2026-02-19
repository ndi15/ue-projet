import java.util.Stack ;
 import java.util.*; 
public class pile {
       ArrayDeque<maillon> pil ; 
         
         
         
         //initialiser 
         public pile(){
               this.pil=new ArrayDeque<>();
               }
           public void empiler( maillon m ){
                    
                    pil.push(m);
                    }
                    
            // additionne un maillpn = une case passer 
            public maillon depiler(){
                   maillon m=pil.pop();
                   return m;
                   }
                 //on regarde le sommet du pile 
                public maillon sommet(){
                        maillon m ;
                        m=pil.peek();
                        return m;
                        }
                public boolean isEmpty(){
                       return pil.isEmpty();
                       }
                       //la taille de la pile   
                public int  size(){
                   return pil.size();
                   }
                /* public void clear()
                  {
                      pile.clear();}*/
               
               public pile copie(pile p){
                 pile temp=new pile();
                 pile resultat =new pile();
                 
                 // je vide p vers temps 
                 while(!p.isEmpty()){
                    maillon c =p.sommet();
                    p.depiler();
                    temp.empiler(c);
                    }
                    
                    
                    // reconstruire p et construire la copie
                     while(!temp.isEmpty()){
                       maillon c =temp.sommet();
                       p.empiler(c);//on remet dans l'original 
                       resultat.empiler(c);//copie 
                       }
                         return resultat;
                       }
                    }
                    
               
               
               
