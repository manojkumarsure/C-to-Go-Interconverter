//
// Generated by JTB 1.3.2
//

package syntaxtree;

/**
 * Grammar production:
 * f0 -> <IDENTIFIER>
 * f1 -> ":"
 * f2 -> Statement()
 */
public class GotoLabel implements Node {
   public NodeToken f0;
   public NodeToken f1;
   public Statement f2;

   public GotoLabel(NodeToken n0, NodeToken n1, Statement n2) {
      f0 = n0;
      f1 = n1;
      f2 = n2;
   }

   public GotoLabel(NodeToken n0, Statement n1) {
      f0 = n0;
      f1 = new NodeToken(":");
      f2 = n1;
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

