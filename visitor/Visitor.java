//
// Generated by JTB 1.3.2
//

package visitor;
import syntaxtree.*;
import java.util.*;

/**
 * All void visitors must implement this interface.
 */

public interface Visitor {

   //
   // void Auto class visitors
   //

   public void visit(NodeList n);
   public void visit(NodeListOptional n);
   public void visit(NodeOptional n);
   public void visit(NodeSequence n);
   public void visit(NodeToken n);

   //
   // User-generated visitor methods below
   //

   /**
    * f0 -> ( ExternalDeclaration() )+
    */
   public void visit(TranslationUnit n);

   /**
    * f0 -> ( FunctionDefinition() | Declaration() )
    */
   public void visit(ExternalDeclaration n);

   /**
    * f0 -> [ DeclarationSpecifiers() ]
    * f1 -> Declarator()
    * f2 -> [ DeclarationList() ]
    * f3 -> CompoundStatement()
    */
   public void visit(FunctionDefinition n);

   /**
    * f0 -> DeclarationSpecifiers()
    * f1 -> [ InitDeclaratorList() ]
    * f2 -> ";"
    */
   public void visit(Declaration n);

   /**
    * f0 -> ( Declaration() )+
    */
   public void visit(DeclarationList n);

   /**
    * f0 -> TypeSpecifier()
    * f1 -> [ DeclarationSpecifiers() ]
    */
   public void visit(DeclarationSpecifiers n);

   /**
    * f0 -> ( <VOID> | <CHAR> | <INT> | <LONG> | <FLOAT> | <DOUBLE> )
    */
   public void visit(TypeSpecifier n);

   /**
    * f0 -> InitDeclarator()
    * f1 -> ( "," InitDeclarator() )*
    */
   public void visit(InitDeclaratorList n);

   /**
    * f0 -> Declarator()
    * f1 -> [ "=" Initializer() ]
    */
   public void visit(InitDeclarator n);

   /**
    * f0 -> TypeSpecifier()
    * f1 -> [ SpecifierQualifierList() ]
    */
   public void visit(SpecifierQualifierList n);

   /**
    * f0 -> Enumerator()
    * f1 -> ( "," Enumerator() )*
    */
   public void visit(EnumeratorList n);

   /**
    * f0 -> <IDENTIFIER>
    * f1 -> [ "=" ConstantExpression() ]
    */
   public void visit(Enumerator n);

   /**
    * f0 -> [ Pointer() ]
    * f1 -> DirectDeclarator()
    */
   public void visit(Declarator n);

   /**
    * f0 -> ( t=<IDENTIFIER> | "(" Declarator() ")" )
    * f1 -> ( "[" [ ConstantExpression() ] "]" | "(" ParameterTypeList() ")" | "(" [ IdentifierList() ] ")" )*
    */
   public void visit(DirectDeclarator n);

   /**
    * f0 -> "*"
    * f1 -> [ Pointer() ]
    */
   public void visit(Pointer n);

   /**
    * f0 -> ParameterList()
    * f1 -> [ "," "..." ]
    */
   public void visit(ParameterTypeList n);

   /**
    * f0 -> ParameterDeclaration()
    * f1 -> ( "," ParameterDeclaration() )*
    */
   public void visit(ParameterList n);

   /**
    * f0 -> DeclarationSpecifiers()
    * f1 -> ( Declarator() | [ AbstractDeclarator() ] )
    */
   public void visit(ParameterDeclaration n);

   /**
    * f0 -> <IDENTIFIER>
    * f1 -> ( "," <IDENTIFIER> )*
    */
   public void visit(IdentifierList n);

   /**
    * f0 -> ( AssignmentExpression() | Initializer1() )
    */
   public void visit(Initializer n);

   /**
    * f0 -> "{"
    * f1 -> InitializerList()
    * f2 -> [ comma() ]
    * f3 -> "}"
    */
   public void visit(Initializer1 n);

   /**
    * f0 -> ","
    */
   public void visit(comma n);

   /**
    * f0 -> Initializer()
    * f1 -> ( "," Initializer() )*
    */
   public void visit(InitializerList n);

   /**
    * f0 -> SpecifierQualifierList()
    * f1 -> [ AbstractDeclarator() ]
    */
   public void visit(TypeName n);

   /**
    * f0 -> ( Pointer() | AbstractDeclarator1() )
    */
   public void visit(AbstractDeclarator n);

   /**
    * f0 -> [ Pointer() ]
    * f1 -> DirectAbstractDeclarator()
    */
   public void visit(AbstractDeclarator1 n);

   /**
    * f0 -> ( "(" AbstractDeclarator() ")" | "[" [ ConstantExpression() ] "]" | "(" [ ParameterTypeList() ] ")" )
    * f1 -> ( "[" [ ConstantExpression() ] "]" | "(" [ ParameterTypeList() ] ")" )*
    */
   public void visit(DirectAbstractDeclarator n);

   /**
    * f0 -> ( LabeledStatement() | ExpressionStatement() | CompoundStatement() | SelectionStatement() | IterationStatement() | JumpStatement() )
    */
   public void visit(Statement n);

   /**
    * f0 -> ( GotoLabel() | CaseLabel() | DefaultLabel() )
    */
   public void visit(LabeledStatement n);

   /**
    * f0 -> <IDENTIFIER>
    * f1 -> ":"
    * f2 -> Statement()
    */
   public void visit(GotoLabel n);

   /**
    * f0 -> <CASE>
    * f1 -> ConstantExpression()
    * f2 -> ":"
    * f3 -> Statement()
    */
   public void visit(CaseLabel n);

   /**
    * f0 -> <DFLT>
    * f1 -> ":"
    * f2 -> Statement()
    */
   public void visit(DefaultLabel n);

   /**
    * f0 -> [ Expression() ]
    * f1 -> ";"
    */
   public void visit(ExpressionStatement n);

   /**
    * f0 -> "{"
    * f1 -> [ DeclarationList() ]
    * f2 -> [ StatementList() ]
    * f3 -> "}"
    */
   public void visit(CompoundStatement n);

   /**
    * f0 -> ( Statement() )+
    */
   public void visit(StatementList n);

   /**
    * f0 -> ( IfStatement() | SwitchStatement() )
    */
   public void visit(SelectionStatement n);

   /**
    * f0 -> <IF>
    * f1 -> "("
    * f2 -> Expression()
    * f3 -> ")"
    * f4 -> Statement()
    * f5 -> [ <ELSE> Statement() ]
    */
   public void visit(IfStatement n);

   /**
    * f0 -> <SWITCH>
    * f1 -> "("
    * f2 -> Expression()
    * f3 -> ")"
    * f4 -> Statement()
    */
   public void visit(SwitchStatement n);

   /**
    * f0 -> ( WhileStatement() | DoWhileStatement() | ForStatement() )
    */
   public void visit(IterationStatement n);

   /**
    * f0 -> <WHILE>
    * f1 -> "("
    * f2 -> Expression()
    * f3 -> ")"
    * f4 -> Statement()
    */
   public void visit(WhileStatement n);

   /**
    * f0 -> <DO>
    * f1 -> Statement()
    * f2 -> <WHILE>
    * f3 -> "("
    * f4 -> Expression()
    * f5 -> ")"
    * f6 -> ";"
    */
   public void visit(DoWhileStatement n);

   /**
    * f0 -> <FOR>
    * f1 -> "("
    * f2 -> [ Expression() ]
    * f3 -> ";"
    * f4 -> [ Expression() ]
    * f5 -> ";"
    * f6 -> [ Expression() ]
    * f7 -> ")"
    * f8 -> Statement()
    */
   public void visit(ForStatement n);

   /**
    * f0 -> ( <GOTO> <IDENTIFIER> ";" | <CONTINUE> ";" | <BREAK> ";" | <RETURN> [ Expression() ] ";" )
    */
   public void visit(JumpStatement n);

   /**
    * f0 -> AssignmentExpression()
    * f1 -> ( "," AssignmentExpression() )*
    */
   public void visit(Expression n);

   /**
    * f0 -> UnaryExpression() AssignmentOperator() AssignmentExpression()
    *       | ConditionalExpression()
    */
   public void visit(AssignmentExpression n);

   /**
    * f0 -> ( "=" | "*=" | "/=" | "%=" | "+=" | "-=" | "<<=" | ">>=" | "&=" | "^=" | "|=" )
    */
   public void visit(AssignmentOperator n);

   /**
    * f0 -> LogicalORExpression()
    * f1 -> [ ConditionalSubExpression() ]
    */
   public void visit(ConditionalExpression n);

   /**
    * f0 -> "?"
    * f1 -> Expression()
    * f2 -> ":"
    * f3 -> ConditionalExpression()
    */
   public void visit(ConditionalSubExpression n);

   /**
    * f0 -> ConditionalExpression()
    */
   public void visit(ConstantExpression n);

   /**
    * f0 -> LogicalANDExpression()
    * f1 -> [ "||" LogicalORExpression() ]
    */
   public void visit(LogicalORExpression n);

   /**
    * f0 -> InclusiveORExpression()
    * f1 -> [ "&&" LogicalANDExpression() ]
    */
   public void visit(LogicalANDExpression n);

   /**
    * f0 -> ExclusiveORExpression()
    * f1 -> [ "|" InclusiveORExpression() ]
    */
   public void visit(InclusiveORExpression n);

   /**
    * f0 -> ANDExpression()
    * f1 -> [ "^" ExclusiveORExpression() ]
    */
   public void visit(ExclusiveORExpression n);

   /**
    * f0 -> EqualityExpression()
    * f1 -> [ "&" ANDExpression() ]
    */
   public void visit(ANDExpression n);

   /**
    * f0 -> RelationalExpression()
    * f1 -> [ EqualitySymbols() ]
    */
   public void visit(EqualityExpression n);

   /**
    * f0 -> EqualityExpression1()
    *       | EqualityExpression2()
    */
   public void visit(EqualitySymbols n);

   /**
    * f0 -> "=="
    * f1 -> EqualityExpression()
    */
   public void visit(EqualityExpression1 n);

   /**
    * f0 -> "!="
    * f1 -> EqualityExpression()
    */
   public void visit(EqualityExpression2 n);

   /**
    * f0 -> ShiftExpression()
    * f1 -> [ RelationalSymbols() ]
    */
   public void visit(RelationalExpression n);

   /**
    * f0 -> RelationalExpression1()
    *       | RelationalExpression2()
    *       | RelationalExpression3()
    *       | RelationalExpression4()
    */
   public void visit(RelationalSymbols n);

   /**
    * f0 -> "<"
    * f1 -> RelationalExpression()
    */
   public void visit(RelationalExpression1 n);

   /**
    * f0 -> ">"
    * f1 -> RelationalExpression()
    */
   public void visit(RelationalExpression2 n);

   /**
    * f0 -> "<="
    * f1 -> RelationalExpression()
    */
   public void visit(RelationalExpression3 n);

   /**
    * f0 -> ">="
    * f1 -> RelationalExpression()
    */
   public void visit(RelationalExpression4 n);

   /**
    * f0 -> AdditiveExpression()
    * f1 -> [ ShiftSymbols() ]
    */
   public void visit(ShiftExpression n);

   /**
    * f0 -> ShiftExpression1()
    *       | ShiftExpression2()
    */
   public void visit(ShiftSymbols n);

   /**
    * f0 -> "<<"
    * f1 -> ShiftExpression()
    */
   public void visit(ShiftExpression1 n);

   /**
    * f0 -> ">>"
    * f1 -> ShiftExpression()
    */
   public void visit(ShiftExpression2 n);

   /**
    * f0 -> MultiplicativeExpression()
    * f1 -> [ AddSymbols() ]
    */
   public void visit(AdditiveExpression n);

   /**
    * f0 -> AdditiveExpression1()
    *       | AdditiveExpression2()
    */
   public void visit(AddSymbols n);

   /**
    * f0 -> "+"
    * f1 -> AdditiveExpression()
    */
   public void visit(AdditiveExpression1 n);

   /**
    * f0 -> "-"
    * f1 -> AdditiveExpression()
    */
   public void visit(AdditiveExpression2 n);

   /**
    * f0 -> CastExpression()
    * f1 -> [ MulSymbols() ]
    */
   public void visit(MultiplicativeExpression n);

   /**
    * f0 -> MultiplicativeExpression1()
    *       | MultiplicativeExpression2()
    *       | MultiplicativeExpression3()
    */
   public void visit(MulSymbols n);

   /**
    * f0 -> "*"
    * f1 -> MultiplicativeExpression()
    */
   public void visit(MultiplicativeExpression1 n);

   /**
    * f0 -> "/"
    * f1 -> MultiplicativeExpression()
    */
   public void visit(MultiplicativeExpression2 n);

   /**
    * f0 -> "%"
    * f1 -> MultiplicativeExpression()
    */
   public void visit(MultiplicativeExpression3 n);

   /**
    * f0 -> ( CastExpression1() | UnaryExpression() )
    */
   public void visit(CastExpression n);

   /**
    * f0 -> "("
    * f1 -> TypeName()
    * f2 -> ")"
    * f3 -> CastExpression()
    */
   public void visit(CastExpression1 n);

   /**
    * f0 -> ( UnaryExpression1() | UnaryExpression2() | UnaryExpression3() | UnaryExpression4() )
    */
   public void visit(UnaryExpression n);

   /**
    * f0 -> PostfixExpression()
    */
   public void visit(UnaryExpression1 n);

   /**
    * f0 -> "++"
    * f1 -> UnaryExpression()
    */
   public void visit(UnaryExpression2 n);

   /**
    * f0 -> "--"
    * f1 -> UnaryExpression()
    */
   public void visit(UnaryExpression3 n);

   /**
    * f0 -> UnaryOperator()
    * f1 -> CastExpression()
    */
   public void visit(UnaryExpression4 n);

   /**
    * f0 -> ( "&" | "*" | "+" | "-" | "~" | "!" )
    */
   public void visit(UnaryOperator n);

   /**
    * f0 -> PrimaryExpression()
    * f1 -> ( PostfixExpression1() | "(" [ ArgumentExpressionList() ] ")" | PostfixExpression3() | PostfixExpression4() | PostfixExpression5() | PostfixExpression6() )*
    */
   public void visit(PostfixExpression n);

   /**
    * f0 -> "["
    * f1 -> Expression()
    * f2 -> "]"
    */
   public void visit(PostfixExpression1 n);

   /**
    * f0 -> "."
    * f1 -> <IDENTIFIER>
    */
   public void visit(PostfixExpression3 n);

   /**
    * f0 -> "->"
    * f1 -> <IDENTIFIER>
    */
   public void visit(PostfixExpression4 n);

   /**
    * f0 -> "++"
    */
   public void visit(PostfixExpression5 n);

   /**
    * f0 -> "--"
    */
   public void visit(PostfixExpression6 n);

   /**
    * f0 -> ( <IDENTIFIER> | Constant() | "(" Expression() ")" )
    */
   public void visit(PrimaryExpression n);

   /**
    * f0 -> AssignmentExpression()
    * f1 -> ( "," AssignmentExpression() )*
    */
   public void visit(ArgumentExpressionList n);

   /**
    * f0 -> <INTEGER_LITERAL>
    *       | <FLOATING_POINT_LITERAL>
    *       | <CHARACTER_LITERAL>
    *       | <STRING_LITERAL>
    */
   public void visit(Constant n);

}

