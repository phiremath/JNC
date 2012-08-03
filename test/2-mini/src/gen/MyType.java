/* 
 * @(#)MyType.java        1.0 3/8/12
 *
 * This file has been auto-generated by JPyang, the
 * Java output format plug-in of pyang.
 * Origin: module "mini", revision: "unknown".
 */

package gen;

import com.tailf.jnc.*;
import java.util.HashMap;

/**
 * This class represents a "my-type" element
 * from the namespace http://example.com/ns/mini/1.0
 *
 * @version 1.0 2012-8-3
 * @author Auto Generated
 */
public class MyType extends com.tailf.jnc.YangString {

    /**
     * Constructor for MyType object from a string.
     * @param value Value to construct the MyType from.
     */
    public MyType(String value) throws YangException {
        super(value);
        check();
    }

    /**
     * Sets the value using a string value.
     * @param value The value to set.
     */
    public void setValue(String value) throws YangException {
        super.setValue(value);
        check();
    }

    /**
     * Checks all restrictions (if any).
     */
    public void check() throws YangException {
    }

}