package calculator.parser;

import calculator.lexer.LexType;

public class BracketSequence extends Sequence {

    public BracketSequence(RootAlternative root){
        getMembers().add(new Terminal(LexType.OpenBracket));
        getMembers().add(root);
        getMembers().add(new Terminal(LexType.CloseBracket));
    }

    @Override
    protected Object collect(Object[] results) {
        return results[1];
    }
}
