//
// Generated by JTB 1.3.2
//

package syntaxtree;

/**
 * Grammar production:
 * f0 -> "<"
 * f1 -> RelationalExpression()
 */
public class RelationalExpression1 implements Node {
   public NodeToken f0;
   public RelationalExpression f1;

   public RelationalExpression1(NodeToken n0, RelationalExpression n1) {
      f0 = n0;
      f1 = n1;
   }

   public RelationalExpression1(RelationalExpression n0) {
      f0 = new NodeToken("<");
      f1 = n0;
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

