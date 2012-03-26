/* Generated By:JavaCC: Do not edit this line. ELParserConstants.java */
package org.boc.rule.format;

public interface ELParserConstants {

  int EOF = 0;
  int NOMEAN = 1;
  int INTEGER_LITERAL = 2;
  int FLOATING_POINT_LITERAL = 3;
  int EXPONENT = 4;
  int STRING_LITERAL = 5;
  int BADLY_ESCAPED_STRING_LITERAL = 6;
  int TRUE1 = 7;
  int TRUE2 = 8;
  int FALSE1 = 9;
  int FALSE2 = 10;
  int NULL = 11;
  int DOT = 12;
  int GT1 = 13;
  int GT2 = 14;
  int GT3 = 15;
  int GT4 = 16;
  int LT1 = 17;
  int LT2 = 18;
  int LT3 = 19;
  int LT4 = 20;
  int EQ1 = 21;
  int EQ2 = 22;
  int EQ3 = 23;
  int LE1 = 24;
  int LE2 = 25;
  int LE3 = 26;
  int LE4 = 27;
  int GE1 = 28;
  int GE2 = 29;
  int GE3 = 30;
  int GE4 = 31;
  int NE1 = 32;
  int NE2 = 33;
  int NE3 = 34;
  int LPAREN1 = 35;
  int LPAREN2 = 36;
  int RPAREN1 = 37;
  int RPAREN2 = 38;
  int SEMI1 = 39;
  int SEMI2 = 40;
  int COMMA1 = 41;
  int COMMA2 = 42;
  int COLON = 43;
  int LBRACKET = 44;
  int RBRACKET = 45;
  int PLUS1 = 46;
  int PLUS2 = 47;
  int PLUS3 = 48;
  int PLUS4 = 49;
  int MINUS1 = 50;
  int MINUS2 = 51;
  int MINUS3 = 52;
  int MINUS4 = 53;
  int MULTIPLY1 = 54;
  int MULTIPLY2 = 55;
  int MULTIPLY3 = 56;
  int DIVIDE1 = 57;
  int DIVIDE2 = 58;
  int DIVIDE3 = 59;
  int DIVIDE4 = 60;
  int MODULUS1 = 61;
  int MODULUS2 = 62;
  int NOT1 = 63;
  int NOT2 = 64;
  int NOT3 = 65;
  int AND1 = 66;
  int AND2 = 67;
  int AND3 = 68;
  int OR1 = 69;
  int OR2 = 70;
  int OR3 = 71;
  int EMPTY = 72;
  int COND = 73;
  int EQUAL1 = 74;
  int EQUAL2 = 75;
  int EQUAL3 = 76;
  int EQUAL4 = 77;
  int IF1 = 78;
  int IF2 = 79;
  int IF3 = 80;
  int THEN1 = 81;
  int THEN2 = 82;
  int THEN3 = 83;
  int ELSE1 = 84;
  int ELSE2 = 85;
  int ELSE3 = 86;
  int ADDEQ1 = 87;
  int ADDEQ2 = 88;
  int MINUSEQ1 = 89;
  int MINUSEQ2 = 90;
  int STATEMENT_START = 91;
  int STATEMENT_END = 92;
  int IDENTIFIER = 93;
  int IMPL_OBJ_START = 94;
  int LETTER = 95;
  int DIGIT = 96;
  int ILLEGAL_CHARACTER = 97;

  int DEFAULT = 0;

  String[] tokenImage = {
    "<EOF>",
    "<NOMEAN>",
    "<INTEGER_LITERAL>",
    "<FLOATING_POINT_LITERAL>",
    "<EXPONENT>",
    "<STRING_LITERAL>",
    "<BADLY_ESCAPED_STRING_LITERAL>",
    "\"true\"",
    "\"\\u771f\"",
    "\"false\"",
    "\"\\u5047\"",
    "\"null\"",
    "\".\"",
    "\">\"",
    "\"gt\"",
    "\"\\u5927\\u4e8e\"",
    "\"\\u8d85\\u8fc7\"",
    "\"<\"",
    "\"lt\"",
    "\"\\u5c0f\\u4e8e\"",
    "\"\\u5c11\\u4e8e\"",
    "\"==\"",
    "\"eq\"",
    "\"\\u662f\"",
    "\"<=\"",
    "\"le\"",
    "\"\\u4e0d\\u5927\\u4e8e\"",
    "\"\\u6ca1\\u8d85\\u8fc7\"",
    "\">=\"",
    "\"ge\"",
    "\"\\u4e0d\\u5c0f\\u4e8e\"",
    "\"\\u81f3\\u5c11\"",
    "\"!=\"",
    "\"ne\"",
    "\"\\u4e0d\\u7b49\\u4e8e\"",
    "\"(\"",
    "\"\\uff08\"",
    "\")\"",
    "\"\\uff09\"",
    "\";\"",
    "\"\\uff1b\"",
    "\",\"",
    "\"\\uff0c\"",
    "\":\"",
    "\"[\"",
    "\"]\"",
    "\"+\"",
    "\"\\u52a0\"",
    "\"\\u6b63\"",
    "\"\\uff0b\"",
    "\"-\"",
    "\"\\u51cf\"",
    "\"\\u8d1f\"",
    "\"\\uff0d\"",
    "\"*\"",
    "\"\\u4e58\"",
    "\"\\u00d7\"",
    "\"/\"",
    "\"div\"",
    "\"\\u9664\"",
    "\"\\u00f7\"",
    "\"%\"",
    "\"mod\"",
    "\"not\"",
    "\"!\"",
    "\"\\u4e0d\\u662f\"",
    "\"and\"",
    "\"&&\"",
    "\"\\u5e76\\u4e14\"",
    "\"or\"",
    "\"||\"",
    "\"\\u6216\\u8005\"",
    "\"empty\"",
    "\"?\"",
    "\"=\"",
    "\"\\u7b49\\u4e8e\"",
    "\"\\u4e3a\"",
    "\"\\uff1d\"",
    "\"if\"",
    "\"\\u5982\\u679c\"",
    "\"\\u5047\\u5982\"",
    "\"then\"",
    "\"\\u90a3\\u4e48\"",
    "\"\\u5c31\"",
    "\"else\"",
    "\"\\u5426\\u5219\"",
    "\"\\u4e0d\\u7136\"",
    "\"+=\"",
    "\"\\u52a0\\u4e0a\"",
    "\"-=\"",
    "\"\\u51cf\\u53bb\"",
    "\"{\"",
    "\"}\"",
    "<IDENTIFIER>",
    "\"#\"",
    "<LETTER>",
    "<DIGIT>",
    "<ILLEGAL_CHARACTER>",
  };

}
