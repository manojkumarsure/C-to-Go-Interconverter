//
// Generated by JTB 1.3.2
//

package syntaxtree;

/**
 * Grammar production:
 * f0 -> "while"
 * f1 -> Expression()
 * f2 -> "{"
 * f3 -> Statement()
 * f4 -> "}"
 */
public class WhileStatement implements Node {
   public NodeToken f0;
   public Expression f1;
   public NodeToken f2;
   public Statement f3;
   public NodeToken f4;

   public WhileStatement(NodeToken n0, Expression n1, NodeToken n2, Statement n3, NodeToken n4) {
      f0 = n0;
      f1 = n1;
      f2 = n2;
      f3 = n3;
      f4 = n4;
   }

   public WhileStatement(Expression n0, Statement n1) {
      f0 = new NodeToken("while");
      f1 = n0;
      f2 = new NodeToken("{");
      f3 = n1;
      f4 = new NodeToken("}");
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

