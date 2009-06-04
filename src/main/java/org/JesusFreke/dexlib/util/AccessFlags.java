/*
 * [The "BSD licence"]
 * Copyright (c) 2009 Ben Gruver
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 * 1. Redistributions of source code must retain the above copyright
 *    notice, this list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in the
 *    documentation and/or other materials provided with the distribution.
 * 3. The name of the author may not be used to endorse or promote products
 *    derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE AUTHOR ``AS IS'' AND ANY EXPRESS OR
 * IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 * OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.
 * IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY DIRECT, INDIRECT,
 * INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT
 * NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 * DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 * THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF
 * THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package org.JesusFreke.dexlib.util;

import java.util.HashMap;

public class AccessFlags
{
    public static final int PUBLIC = 0x01;
    public static final int PRIVATE = 0x02;
    public static final int PROTECTED = 0x04;
    public static final int STATIC = 0x08;
    public static final int FINAL = 0x10;
    public static final int SYNCHRONIZED = 0x20;
    public static final int VOLATILE = 0x40;
    public static final int BRIDGE = 0x40;
    public static final int TRANSIENT = 0x80;
    public static final int VARARGS = 0x80;
    public static final int NATIVE = 0x100;
    public static final int INTERFACE = 0x200;
    public static final int ABSTRACT = 0x400;
    public static final int STRICTFP = 0x800;
    public static final int SYNTHETIC = 0x1000;
    public static final int ANNOTATION = 0x2000;
    public static final int ENUM = 0x4000;
    public static final int CONSTRUCTOR = 0x10000;
    public static final int DECLARED_SYNCHRONIZED = 0x20000;

    private static HashMap<String, Integer> accessFlagValues;

    static {
        accessFlagValues = new HashMap<String, Integer>();
        accessFlagValues.put("public", PUBLIC);
        accessFlagValues.put("private", PRIVATE);
        accessFlagValues.put("static", STATIC);
        accessFlagValues.put("final", FINAL);
        accessFlagValues.put("synchronized", SYNCHRONIZED);
        accessFlagValues.put("volatile", VOLATILE);
        accessFlagValues.put("bridge", BRIDGE);
        accessFlagValues.put("transient", TRANSIENT);
        accessFlagValues.put("varargs", VARARGS);
        accessFlagValues.put("native", NATIVE);
        accessFlagValues.put("interface", INTERFACE);
        accessFlagValues.put("abstract", ABSTRACT);
        accessFlagValues.put("strictfp", STRICTFP);
        accessFlagValues.put("synthetic", SYNTHETIC);
        accessFlagValues.put("annotation", ANNOTATION);
        accessFlagValues.put("enum", ENUM);
        accessFlagValues.put("constructor", CONSTRUCTOR);
        accessFlagValues.put("declared-synchronized", DECLARED_SYNCHRONIZED);
    }

    public static int getValueForAccessFlag(String accessFlag) {
        Integer retVal;
        retVal = accessFlagValues.get(accessFlag);
        if (retVal == null) {
            return 0;
        }

        return retVal.intValue();
    }
}