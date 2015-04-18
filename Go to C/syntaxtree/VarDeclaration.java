//
// Generated by JTB 1.3.2
//

package syntaxtree;

/**
 * Grammar production:
 * f0 -> "var"
 * f1 -> Identifier()
 * f2 -> ( "," Identifier() )*
 * f3 -> Type()
 */
public class VarDeclaration implements Node {
   public NodeToken f0;
   public Identifier f1;
   public NodeListOptional f2;
   public Type f3;

   public VarDeclaration(NodeToken n0, Identifier n1, NodeListOptional n2, Type n3) {
      f0 = n0;
      f1 = n1;
      f2 = n2;
      f3 = n3;
   }

   public VarDeclaration(Identifier n0, NodeListOptional n1, Type n2) {
      f0 = new NodeToken("var");
      f1 = n0;
      f2 = n1;
      f3 = n2;
   }

   public void accept(visitor.Visitor v) {
      v.visit(this);
   }
   public <R,A> R accept(visitor.GJVisitor<R,A> v, A argu) {
      return v.visit(this,argu);
   }
   public <R> R accept(visitor.GJNoArguVisitor<R> v) {
      return v.visit(this);
   }
   public <A> void accept(visitor.GJVoidVisitor<A> v, A argu) {
      v.visit(this,argu);
   }
}
