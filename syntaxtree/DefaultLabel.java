//
// Generated by JTB 1.3.2
//

package syntaxtree;

/**
 * Grammar production:
 * f0 -> <DFLT>
 * f1 -> ":"
 * f2 -> Statement()
 */
public class DefaultLabel implements Node {
   public NodeToken f0;
   public NodeToken f1;
   public Statement f2;

   public DefaultLabel(NodeToken n0, NodeToken n1, Statement n2) {
      f0 = n0;
      f1 = n1;
      f2 = n2;
   }

   public DefaultLabel(Statement n0) {
      f0 = new NodeToken("default");
      f1 = new NodeToken(":");
      f2 = n0;
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

