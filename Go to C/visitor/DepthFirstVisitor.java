//
// Generated by JTB 1.3.2
//

package visitor;
import syntaxtree.*;
import java.util.*;

/**
 * Provides default methods which visit each node in the tree in depth-first
 * order.  Your visitors may extend this class.
 */
public class DepthFirstVisitor implements Visitor {
   //
   // Auto class visitors--probably don't need to be overridden.
   //
   public void visit(NodeList n) {
      for ( Enumeration<Node> e = n.elements(); e.hasMoreElements(); )
         e.nextElement().accept(this);
   }

   public void visit(NodeListOptional n) {
      if ( n.present() )
         for ( Enumeration<Node> e = n.elements(); e.hasMoreElements(); )
            e.nextElement().accept(this);
   }

   public void visit(NodeOptional n) {
      if ( n.present() )
         n.node.accept(this);
   }

   public void visit(NodeSequence n) {
      for ( Enumeration<Node> e = n.elements(); e.hasMoreElements(); )
         e.nextElement().accept(this);
   }

   public void visit(NodeToken n) { }

   //
   // User-generated visitor methods below
   //

   /**
    * f0 -> Packages()
    * f1 -> Imports()
    * f2 -> ( FunctionDeclaration() )*
    * f3 -> <EOF>
    */
   public void visit(Goal n) {
      n.f0.accept(this);
      n.f1.accept(this);
      n.f2.accept(this);
      n.f3.accept(this);
   }

   /**
    * f0 -> PackageOther()
    *       | PackageMain()
    */
   public void visit(Packages n) {
      n.f0.accept(this);
   }

   /**
    * f0 -> "package"
    * f1 -> Identifier()
    */
   public void visit(PackageOther n) {
      n.f0.accept(this);
      n.f1.accept(this);
   }

   /**
    * f0 -> "package"
    * f1 -> "main"
    */
   public void visit(PackageMain n) {
      n.f0.accept(this);
      n.f1.accept(this);
   }

   /**
    * f0 -> SingleImport()
    *       | MultipleImport()
    */
   public void visit(Imports n) {
      n.f0.accept(this);
   }

   /**
    * f0 -> "import"
    * f1 -> "\""
    * f2 -> Identifier()
    * f3 -> "\""
    */
   public void visit(SingleImport n) {
      n.f0.accept(this);
      n.f1.accept(this);
      n.f2.accept(this);
      n.f3.accept(this);
   }

   /**
    * f0 -> "import"
    * f1 -> "("
    * f2 -> ( "\"" Identifier() "\"" )*
    * f3 -> ")"
    */
   public void visit(MultipleImport n) {
      n.f0.accept(this);
      n.f1.accept(this);
      n.f2.accept(this);
      n.f3.accept(this);
   }

   /**
    * f0 -> MainFunctionDeclaration()
    *       | OtherFunctionDeclaration()
    */
   public void visit(FunctionDeclaration n) {
      n.f0.accept(this);
   }

   /**
    * f0 -> "func"
    * f1 -> "main"
    * f2 -> "("
    * f3 -> ")"
    * f4 -> "{"
    * f5 -> ( VarDeclaration() )*
    * f6 -> ( Statement() )*
    * f7 -> "}"
    */
   public void visit(MainFunctionDeclaration n) {
      n.f0.accept(this);
      n.f1.accept(this);
      n.f2.accept(this);
      n.f3.accept(this);
      n.f4.accept(this);
      n.f5.accept(this);
      n.f6.accept(this);
      n.f7.accept(this);
   }

   /**
    * f0 -> "func"
    * f1 -> Identifier()
    * f2 -> Signature()
    * f3 -> [ Type() ]
    * f4 -> "{"
    * f5 -> ( VarDeclaration() )*
    * f6 -> ( Statement() )*
    * f7 -> [ ReturnExpression() ]
    * f8 -> "}"
    */
   public void visit(OtherFunctionDeclaration n) {
      n.f0.accept(this);
      n.f1.accept(this);
      n.f2.accept(this);
      n.f3.accept(this);
      n.f4.accept(this);
      n.f5.accept(this);
      n.f6.accept(this);
      n.f7.accept(this);
      n.f8.accept(this);
   }

   /**
    * f0 -> "return"
    * f1 -> Expression()
    */
   public void visit(ReturnExpression n) {
      n.f0.accept(this);
      n.f1.accept(this);
   }

   /**
    * f0 -> "("
    * f1 -> [ VarType() ( CommaVarType() )* ]
    * f2 -> ")"
    */
   public void visit(Signature n) {
      n.f0.accept(this);
      n.f1.accept(this);
      n.f2.accept(this);
   }

   /**
    * f0 -> Identifier()
    * f1 -> Type()
    */
   public void visit(VarType n) {
      n.f0.accept(this);
      n.f1.accept(this);
   }

   /**
    * f0 -> ","
    * f1 -> VarType()
    */
   public void visit(CommaVarType n) {
      n.f0.accept(this);
      n.f1.accept(this);
   }

   /**
    * f0 -> "int"
    */
   public void visit(Type n) {
      n.f0.accept(this);
   }

   /**
    * f0 -> <IDENTIFIER>
    */
   public void visit(Identifier n) {
      n.f0.accept(this);
   }

   /**
    * f0 -> PrintStatement()
    *       | Block()
    *       | IfStatement()
    *       | WhileStatement()
    *       | ForStatement()
    *       | AssignmentStatement()
    *       | Expression()
    */
   public void visit(Statement n) {
      n.f0.accept(this);
   }

   /**
    * f0 -> "{"
    * f1 -> ( VarDeclaration() )*
    * f2 -> ( Statement() )*
    * f3 -> "}"
    */
   public void visit(Block n) {
      n.f0.accept(this);
      n.f1.accept(this);
      n.f2.accept(this);
      n.f3.accept(this);
   }

   /**
    * f0 -> "var"
    * f1 -> Identifier()
    * f2 -> ( CommaIdentifier() )*
    * f3 -> Type()
    */
   public void visit(VarDeclaration n) {
      n.f0.accept(this);
      n.f1.accept(this);
      n.f2.accept(this);
      n.f3.accept(this);
   }

   /**
    * f0 -> ","
    * f1 -> Identifier()
    */
   public void visit(CommaIdentifier n) {
      n.f0.accept(this);
      n.f1.accept(this);
   }

   /**
    * f0 -> PrimaryExpression()
    * f1 -> AssignmentOperator()
    * f2 -> Expression()
    */
   public void visit(AssignmentStatement n) {
      n.f0.accept(this);
      n.f1.accept(this);
      n.f2.accept(this);
   }

   /**
    * f0 -> "="
    *       | "*="
    *       | "/="
    *       | "%="
    *       | "+="
    *       | "-="
    *       | "<<="
    *       | ">>="
    *       | "&="
    *       | "^="
    *       | "|="
    */
   public void visit(AssignmentOperator n) {
      n.f0.accept(this);
   }

   /**
    * f0 -> "if"
    * f1 -> Expression()
    * f2 -> Statement()
    * f3 -> [ ElseStatement() ]
    */
   public void visit(IfStatement n) {
      n.f0.accept(this);
      n.f1.accept(this);
      n.f2.accept(this);
      n.f3.accept(this);
   }

   /**
    * f0 -> "else"
    * f1 -> Statement()
    */
   public void visit(ElseStatement n) {
      n.f0.accept(this);
      n.f1.accept(this);
   }

   /**
    * f0 -> "while"
    * f1 -> Expression()
    * f2 -> Statement()
    */
   public void visit(WhileStatement n) {
      n.f0.accept(this);
      n.f1.accept(this);
      n.f2.accept(this);
   }

   /**
    * f0 -> "for"
    * f1 -> [ AssignmentStatement() ]
    * f2 -> ";"
    * f3 -> [ Expression() ]
    * f4 -> ";"
    * f5 -> [ Statement() ]
    * f6 -> Statement()
    */
   public void visit(ForStatement n) {
      n.f0.accept(this);
      n.f1.accept(this);
      n.f2.accept(this);
      n.f3.accept(this);
      n.f4.accept(this);
      n.f5.accept(this);
      n.f6.accept(this);
   }

   /**
    * f0 -> PrintlnStatement()
    *       | PrintfStatement()
    */
   public void visit(PrintStatement n) {
      n.f0.accept(this);
   }

   /**
    * f0 -> "fmt.Println"
    * f1 -> StringPrint()
    */
   public void visit(PrintlnStatement n) {
      n.f0.accept(this);
      n.f1.accept(this);
   }

   /**
    * f0 -> "fmt.Printf"
    * f1 -> StringPrint()
    */
   public void visit(PrintfStatement n) {
      n.f0.accept(this);
      n.f1.accept(this);
   }

   /**
    * f0 -> "("
    * f1 -> StringMsg()
    * f2 -> ( CommaExpression() )*
    * f3 -> ")"
    */
   public void visit(StringPrint n) {
      n.f0.accept(this);
      n.f1.accept(this);
      n.f2.accept(this);
      n.f3.accept(this);
   }

   /**
    * f0 -> PrimaryExpression()
    * f1 -> [ Operator() Expression() ]
    */
   public void visit(Expression n) {
      n.f0.accept(this);
      n.f1.accept(this);
   }

   /**
    * f0 -> "+"
    *       | "-"
    *       | "*"
    *       | "/"
    *       | "%"
    *       | "<"
    *       | ">"
    *       | "=="
    *       | ">="
    *       | "<="
    *       | "!="
    *       | ">>"
    *       | "<<"
    *       | "&"
    *       | "&&"
    *       | "|"
    *       | "||"
    *       | "^"
    *       | "^="
    *       | "&="
    *       | "|="
    */
   public void visit(Operator n) {
      n.f0.accept(this);
   }

   /**
    * f0 -> IntegerLiteral()
    *       | Identifier() PostfixExpression()
    *       | BracketExpression() ")"
    *       | StringMsg()
    *       | Identifier()
    */
   public void visit(PrimaryExpression n) {
      n.f0.accept(this);
   }

   /**
    * f0 -> ArrayAccessExpression()
    *       | FunctionArgumentExpression()
    *       | Increment()
    *       | Decrement()
    */
   public void visit(PostfixExpression n) {
      n.f0.accept(this);
   }

   /**
    * f0 -> "++"
    */
   public void visit(Increment n) {
      n.f0.accept(this);
   }

   /**
    * f0 -> "--"
    */
   public void visit(Decrement n) {
      n.f0.accept(this);
   }

   /**
    * f0 -> ( SingleArrayAccessExpression() )+
    */
   public void visit(ArrayAccessExpression n) {
      n.f0.accept(this);
   }

   /**
    * f0 -> "["
    * f1 -> Expression()
    * f2 -> "]"
    */
   public void visit(SingleArrayAccessExpression n) {
      n.f0.accept(this);
      n.f1.accept(this);
      n.f2.accept(this);
   }

   /**
    * f0 -> "("
    * f1 -> [ ArgumentExpressionList() ]
    * f2 -> ")"
    */
   public void visit(FunctionArgumentExpression n) {
      n.f0.accept(this);
      n.f1.accept(this);
      n.f2.accept(this);
   }

   /**
    * f0 -> Expression()
    * f1 -> ( CommaExpression() )*
    */
   public void visit(ArgumentExpressionList n) {
      n.f0.accept(this);
      n.f1.accept(this);
   }

   /**
    * f0 -> ","
    * f1 -> Expression()
    */
   public void visit(CommaExpression n) {
      n.f0.accept(this);
      n.f1.accept(this);
   }

   /**
    * f0 -> "("
    * f1 -> Expression()
    */
   public void visit(BracketExpression n) {
      n.f0.accept(this);
      n.f1.accept(this);
   }

   /**
    * f0 -> "\""
    * f1 -> ( SubStrinMsg() )*
    * f2 -> "\""
    */
   public void visit(StringMsg n) {
      n.f0.accept(this);
      n.f1.accept(this);
      n.f2.accept(this);
   }

   /**
    * f0 -> Identifier()
    *       | "."
    *       | Operator()
    *       | ","
    *       | "\\"
    */
   public void visit(SubStrinMsg n) {
      n.f0.accept(this);
   }

   /**
    * f0 -> <INTEGER_LITERAL>
    */
   public void visit(IntegerLiteral n) {
      n.f0.accept(this);
   }

}
