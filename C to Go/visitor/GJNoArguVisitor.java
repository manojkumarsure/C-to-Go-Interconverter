//
// Generated by JTB 1.3.2
//

package visitor;
import syntaxtree.*;
import java.util.*;

/**
 * All GJ visitors with no argument must implement this interface.
 */

public interface GJNoArguVisitor<R> {

   //
   // GJ Auto class visitors with no argument
   //

   public R visit(NodeList n);
   public R visit(NodeListOptional n);
   public R visit(NodeOptional n);
   public R visit(NodeSequence n);
   public R visit(NodeToken n);

   //
   // User-generated visitor methods below
   //

   /**
    * f0 -> ( ExternalDeclaration() )+
    */
   public R visit(TranslationUnit n);

   /**
    * f0 -> ( FunctionDefinition() | Declaration() )
    */
   public R visit(ExternalDeclaration n);

   /**
    * f0 -> [ DeclarationSpecifiers() ]
    * f1 -> Declarator()
    * f2 -> [ DeclarationList() ]
    * f3 -> CompoundStatement()
    */
   public R visit(FunctionDefinition n);

   /**
    * f0 -> DeclarationSpecifiers()
    * f1 -> [ InitDeclaratorList() ]
    * f2 -> ";"
    */
   public R visit(Declaration n);

   /**
    * f0 -> ( Declaration() )+
    */
   public R visit(DeclarationList n);

   /**
    * f0 -> TypeSpecifier()
    * f1 -> [ DeclarationSpecifiers() ]
    */
   public R visit(DeclarationSpecifiers n);

   /**
    * f0 -> ( <VOID> | <CHAR> | <INT> | <LONG> | <FLOAT> | <DOUBLE> )
    */
   public R visit(TypeSpecifier n);

   /**
    * f0 -> InitDeclarator()
    * f1 -> ( "," InitDeclarator() )*
    */
   public R visit(InitDeclaratorList n);

   /**
    * f0 -> Declarator()
    * f1 -> [ "=" Initializer() ]
    */
   public R visit(InitDeclarator n);

   /**
    * f0 -> TypeSpecifier()
    * f1 -> [ SpecifierQualifierList() ]
    */
   public R visit(SpecifierQualifierList n);

   /**
    * f0 -> Enumerator()
    * f1 -> ( "," Enumerator() )*
    */
   public R visit(EnumeratorList n);

   /**
    * f0 -> <IDENTIFIER>
    * f1 -> [ "=" ConstantExpression() ]
    */
   public R visit(Enumerator n);

   /**
    * f0 -> [ Pointer() ]
    * f1 -> DirectDeclarator()
    */
   public R visit(Declarator n);

   /**
    * f0 -> ( t=<IDENTIFIER> | "(" Declarator() ")" )
    * f1 -> ( "[" [ ConstantExpression() ] "]" | "(" ParameterTypeList() ")" | "(" [ IdentifierList() ] ")" )*
    */
   public R visit(DirectDeclarator n);

   /**
    * f0 -> "*"
    * f1 -> [ Pointer() ]
    */
   public R visit(Pointer n);

   /**
    * f0 -> ParameterList()
    * f1 -> [ "," "..." ]
    */
   public R visit(ParameterTypeList n);

   /**
    * f0 -> ParameterDeclaration()
    * f1 -> ( "," ParameterDeclaration() )*
    */
   public R visit(ParameterList n);

   /**
    * f0 -> DeclarationSpecifiers()
    * f1 -> ( Declarator() | [ AbstractDeclarator() ] )
    */
   public R visit(ParameterDeclaration n);

   /**
    * f0 -> <IDENTIFIER>
    * f1 -> ( "," <IDENTIFIER> )*
    */
   public R visit(IdentifierList n);

   /**
    * f0 -> ( AssignmentExpression() | Initializer1() )
    */
   public R visit(Initializer n);

   /**
    * f0 -> "{"
    * f1 -> InitializerList()
    * f2 -> [ comma() ]
    * f3 -> "}"
    */
   public R visit(Initializer1 n);

   /**
    * f0 -> ","
    */
   public R visit(comma n);

   /**
    * f0 -> Initializer()
    * f1 -> ( "," Initializer() )*
    */
   public R visit(InitializerList n);

   /**
    * f0 -> SpecifierQualifierList()
    * f1 -> [ AbstractDeclarator() ]
    */
   public R visit(TypeName n);

   /**
    * f0 -> ( Pointer() | AbstractDeclarator1() )
    */
   public R visit(AbstractDeclarator n);

   /**
    * f0 -> [ Pointer() ]
    * f1 -> DirectAbstractDeclarator()
    */
   public R visit(AbstractDeclarator1 n);

   /**
    * f0 -> ( "(" AbstractDeclarator() ")" | "[" [ ConstantExpression() ] "]" | "(" [ ParameterTypeList() ] ")" )
    * f1 -> ( "[" [ ConstantExpression() ] "]" | "(" [ ParameterTypeList() ] ")" )*
    */
   public R visit(DirectAbstractDeclarator n);

   /**
    * f0 -> ( LabeledStatement() | ExpressionStatement() | CompoundStatement() | SelectionStatement() | IterationStatement() | JumpStatement() )
    */
   public R visit(Statement n);

   /**
    * f0 -> ( GotoLabel() | CaseLabel() | DefaultLabel() )
    */
   public R visit(LabeledStatement n);

   /**
    * f0 -> <IDENTIFIER>
    * f1 -> ":"
    * f2 -> Statement()
    */
   public R visit(GotoLabel n);

   /**
    * f0 -> <CASE>
    * f1 -> ConstantExpression()
    * f2 -> ":"
    * f3 -> Statement()
    */
   public R visit(CaseLabel n);

   /**
    * f0 -> <DFLT>
    * f1 -> ":"
    * f2 -> Statement()
    */
   public R visit(DefaultLabel n);

   /**
    * f0 -> [ Expression() ]
    * f1 -> ";"
    */
   public R visit(ExpressionStatement n);

   /**
    * f0 -> "{"
    * f1 -> [ DeclarationList() ]
    * f2 -> [ StatementList() ]
    * f3 -> "}"
    */
   public R visit(CompoundStatement n);

   /**
    * f0 -> ( Statement() )+
    */
   public R visit(StatementList n);

   /**
    * f0 -> ( IfStatement() | SwitchStatement() )
    */
   public R visit(SelectionStatement n);

   /**
    * f0 -> <IF>
    * f1 -> "("
    * f2 -> Expression()
    * f3 -> ")"
    * f4 -> Statement()
    * f5 -> [ <ELSE> Statement() ]
    */
   public R visit(IfStatement n);

   /**
    * f0 -> <SWITCH>
    * f1 -> "("
    * f2 -> Expression()
    * f3 -> ")"
    * f4 -> Statement()
    */
   public R visit(SwitchStatement n);

   /**
    * f0 -> ( WhileStatement() | DoWhileStatement() | ForStatement() )
    */
   public R visit(IterationStatement n);

   /**
    * f0 -> <WHILE>
    * f1 -> "("
    * f2 -> Expression()
    * f3 -> ")"
    * f4 -> Statement()
    */
   public R visit(WhileStatement n);

   /**
    * f0 -> <DO>
    * f1 -> Statement()
    * f2 -> <WHILE>
    * f3 -> "("
    * f4 -> Expression()
    * f5 -> ")"
    * f6 -> ";"
    */
   public R visit(DoWhileStatement n);

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
   public R visit(ForStatement n);

   /**
    * f0 -> ( <GOTO> <IDENTIFIER> ";" | <CONTINUE> ";" | <BREAK> ";" | <RETURN> [ Expression() ] ";" )
    */
   public R visit(JumpStatement n);

   /**
    * f0 -> AssignmentExpression()
    * f1 -> ( "," AssignmentExpression() )*
    */
   public R visit(Expression n);

   /**
    * f0 -> UnaryExpression() AssignmentOperator() AssignmentExpression()
    *       | ConditionalExpression()
    */
   public R visit(AssignmentExpression n);

   /**
    * f0 -> ( "=" | "*=" | "/=" | "%=" | "+=" | "-=" | "<<=" | ">>=" | "&=" | "^=" | "|=" )
    */
   public R visit(AssignmentOperator n);

   /**
    * f0 -> LogicalORExpression()
    * f1 -> [ ConditionalSubExpression() ]
    */
   public R visit(ConditionalExpression n);

   /**
    * f0 -> "?"
    * f1 -> Expression()
    * f2 -> ":"
    * f3 -> ConditionalExpression()
    */
   public R visit(ConditionalSubExpression n);

   /**
    * f0 -> ConditionalExpression()
    */
   public R visit(ConstantExpression n);

   /**
    * f0 -> LogicalANDExpression()
    * f1 -> [ "||" LogicalORExpression() ]
    */
   public R visit(LogicalORExpression n);

   /**
    * f0 -> InclusiveORExpression()
    * f1 -> [ "&&" LogicalANDExpression() ]
    */
   public R visit(LogicalANDExpression n);

   /**
    * f0 -> ExclusiveORExpression()
    * f1 -> [ "|" InclusiveORExpression() ]
    */
   public R visit(InclusiveORExpression n);

   /**
    * f0 -> ANDExpression()
    * f1 -> [ "^" ExclusiveORExpression() ]
    */
   public R visit(ExclusiveORExpression n);

   /**
    * f0 -> EqualityExpression()
    * f1 -> [ "&" ANDExpression() ]
    */
   public R visit(ANDExpression n);

   /**
    * f0 -> RelationalExpression()
    * f1 -> [ EqualitySymbols() ]
    */
   public R visit(EqualityExpression n);

   /**
    * f0 -> EqualityExpression1()
    *       | EqualityExpression2()
    */
   public R visit(EqualitySymbols n);

   /**
    * f0 -> "=="
    * f1 -> EqualityExpression()
    */
   public R visit(EqualityExpression1 n);

   /**
    * f0 -> "!="
    * f1 -> EqualityExpression()
    */
   public R visit(EqualityExpression2 n);

   /**
    * f0 -> ShiftExpression()
    * f1 -> [ RelationalSymbols() ]
    */
   public R visit(RelationalExpression n);

   /**
    * f0 -> RelationalExpression1()
    *       | RelationalExpression2()
    *       | RelationalExpression3()
    *       | RelationalExpression4()
    */
   public R visit(RelationalSymbols n);

   /**
    * f0 -> "<"
    * f1 -> RelationalExpression()
    */
   public R visit(RelationalExpression1 n);

   /**
    * f0 -> ">"
    * f1 -> RelationalExpression()
    */
   public R visit(RelationalExpression2 n);

   /**
    * f0 -> "<="
    * f1 -> RelationalExpression()
    */
   public R visit(RelationalExpression3 n);

   /**
    * f0 -> ">="
    * f1 -> RelationalExpression()
    */
   public R visit(RelationalExpression4 n);

   /**
    * f0 -> AdditiveExpression()
    * f1 -> [ ShiftSymbols() ]
    */
   public R visit(ShiftExpression n);

   /**
    * f0 -> ShiftExpression1()
    *       | ShiftExpression2()
    */
   public R visit(ShiftSymbols n);

   /**
    * f0 -> "<<"
    * f1 -> ShiftExpression()
    */
   public R visit(ShiftExpression1 n);

   /**
    * f0 -> ">>"
    * f1 -> ShiftExpression()
    */
   public R visit(ShiftExpression2 n);

   /**
    * f0 -> MultiplicativeExpression()
    * f1 -> [ AddSymbols() ]
    */
   public R visit(AdditiveExpression n);

   /**
    * f0 -> AdditiveExpression1()
    *       | AdditiveExpression2()
    */
   public R visit(AddSymbols n);

   /**
    * f0 -> "+"
    * f1 -> AdditiveExpression()
    */
   public R visit(AdditiveExpression1 n);

   /**
    * f0 -> "-"
    * f1 -> AdditiveExpression()
    */
   public R visit(AdditiveExpression2 n);

   /**
    * f0 -> CastExpression()
    * f1 -> [ MulSymbols() ]
    */
   public R visit(MultiplicativeExpression n);

   /**
    * f0 -> MultiplicativeExpression1()
    *       | MultiplicativeExpression2()
    *       | MultiplicativeExpression3()
    */
   public R visit(MulSymbols n);

   /**
    * f0 -> "*"
    * f1 -> MultiplicativeExpression()
    */
   public R visit(MultiplicativeExpression1 n);

   /**
    * f0 -> "/"
    * f1 -> MultiplicativeExpression()
    */
   public R visit(MultiplicativeExpression2 n);

   /**
    * f0 -> "%"
    * f1 -> MultiplicativeExpression()
    */
   public R visit(MultiplicativeExpression3 n);

   /**
    * f0 -> ( CastExpression1() | UnaryExpression() )
    */
   public R visit(CastExpression n);

   /**
    * f0 -> "("
    * f1 -> TypeName()
    * f2 -> ")"
    * f3 -> CastExpression()
    */
   public R visit(CastExpression1 n);

   /**
    * f0 -> ( UnaryExpression1() | UnaryExpression2() | UnaryExpression3() | UnaryExpression4() )
    */
   public R visit(UnaryExpression n);

   /**
    * f0 -> PostfixExpression()
    */
   public R visit(UnaryExpression1 n);

   /**
    * f0 -> "++"
    * f1 -> UnaryExpression()
    */
   public R visit(UnaryExpression2 n);

   /**
    * f0 -> "--"
    * f1 -> UnaryExpression()
    */
   public R visit(UnaryExpression3 n);

   /**
    * f0 -> UnaryOperator()
    * f1 -> CastExpression()
    */
   public R visit(UnaryExpression4 n);

   /**
    * f0 -> ( "&" | "*" | "+" | "-" | "~" | "!" )
    */
   public R visit(UnaryOperator n);

   /**
    * f0 -> PrimaryExpression()
    * f1 -> ( PostfixExpression1() | "(" [ ArgumentExpressionList() ] ")" | PostfixExpression3() | PostfixExpression4() | PostfixExpression5() | PostfixExpression6() )*
    */
   public R visit(PostfixExpression n);

   /**
    * f0 -> "["
    * f1 -> Expression()
    * f2 -> "]"
    */
   public R visit(PostfixExpression1 n);

   /**
    * f0 -> "."
    * f1 -> <IDENTIFIER>
    */
   public R visit(PostfixExpression3 n);

   /**
    * f0 -> "->"
    * f1 -> <IDENTIFIER>
    */
   public R visit(PostfixExpression4 n);

   /**
    * f0 -> "++"
    */
   public R visit(PostfixExpression5 n);

   /**
    * f0 -> "--"
    */
   public R visit(PostfixExpression6 n);

   /**
    * f0 -> ( <IDENTIFIER> | Constant() | "(" Expression() ")" )
    */
   public R visit(PrimaryExpression n);

   /**
    * f0 -> AssignmentExpression()
    * f1 -> ( "," AssignmentExpression() )*
    */
   public R visit(ArgumentExpressionList n);

   /**
    * f0 -> <INTEGER_LITERAL>
    *       | <FLOATING_POINT_LITERAL>
    *       | <CHARACTER_LITERAL>
    *       | <STRING_LITERAL>
    */
   public R visit(Constant n);

}

