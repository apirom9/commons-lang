/*
 * Copyright 2002-2004 The Apache Software Foundation.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.lang.mutable;

/**
 * A mutable <code>Double</code>
 * 
 * @since 2.1
 * @version $Id: MutableDouble.java,v 1.1 2004/06/11 02:26:32 matth Exp $
 */
public class MutableDouble extends MutableNumber {

    /**
     * Internal value.
     */
    private double value;

    /**
     * Instantiates with the specified value
     * @param value a value.
     */
    public MutableDouble(double value) {
        super();
        this.value = value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public double doubleValue() {
        return this.value;
    }

    public long longValue() {
        return (long)this.value;
    }

    public int intValue() {
        return (int)this.value;
    }

    public Object getValue() {
        return new Double(this.value);
    }

    public void setValue(Object value) {
        setValue(((Number)value).doubleValue());
    }

}
