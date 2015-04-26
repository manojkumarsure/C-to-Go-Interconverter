//
// Generated by JTB 1.3.2
//

package syntaxtree;

/**
 * Grammar production:
 * f0 -> PrimaryExpression()
 * f1 -> AssignmentOperator()
 * f2 -> Expression()
 */
public class AssignmentStatement implements Node {
   public PrimaryExpression f0;
   public AssignmentOperator f1;
   public Expression f2;

   public AssignmentStatement(PrimaryExpression n0, AssignmentOperator n1, Expression n2) {
      f0 = n0;
      f1 = n1;
      f2 = n2;
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

