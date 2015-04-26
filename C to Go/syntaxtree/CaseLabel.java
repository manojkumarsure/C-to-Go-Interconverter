//
// Generated by JTB 1.3.2
//

package syntaxtree;

/**
 * Grammar production:
 * f0 -> <CASE>
 * f1 -> ConstantExpression()
 * f2 -> ":"
 * f3 -> Statement()
 */
public class CaseLabel implements Node {
   public NodeToken f0;
   public ConstantExpression f1;
   public NodeToken f2;
   public Statement f3;

   public CaseLabel(NodeToken n0, ConstantExpression n1, NodeToken n2, Statement n3) {
      f0 = n0;
      f1 = n1;
      f2 = n2;
      f3 = n3;
   }

   public CaseLabel(ConstantExpression n0, Statement n1) {
      f0 = new NodeToken("case");
      f1 = n0;
      f2 = new NodeToken(":");
      f3 = n1;
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
