/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.google.clearsilver.jsilver.syntax.node;

import com.google.clearsilver.jsilver.syntax.analysis.*;

@SuppressWarnings("nls")
public final class TCsClose extends Token
{
    public TCsClose(String text)
    {
        setText(text);
    }

    public TCsClose(String text, int line, int pos)
    {
        setText(text);
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TCsClose(getText(), getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTCsClose(this);
    }
}
