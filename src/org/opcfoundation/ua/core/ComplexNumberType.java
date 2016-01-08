 /* Copyright (c) 1996-2015, OPC Foundation. All rights reserved.
   The source code in this file is covered under a dual-license scenario:
     - RCL: for OPC Foundation members in good-standing
     - GPL V2: everybody else
   RCL license terms accompanied with this source code. See http://opcfoundation.org/License/RCL/1.00/
   GNU General Public License as published by the Free Software Foundation;
   version 2 of the License are accompanied with this source code. See http://opcfoundation.org/License/GPLv2
   This source code is distributed in the hope that it will be useful,
   but WITHOUT ANY WARRANTY; without even the implied warranty of
   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
*/

package org.opcfoundation.ua.core;

import org.opcfoundation.ua.builtintypes.Structure;
import org.opcfoundation.ua.builtintypes.ExpandedNodeId;
import org.opcfoundation.ua.core.Identifiers;
import org.opcfoundation.ua.utils.ObjectUtils;



public class ComplexNumberType extends Object implements Structure, Cloneable {
	
	public static final ExpandedNodeId ID = new ExpandedNodeId(Identifiers.ComplexNumberType);
	public static final ExpandedNodeId BINARY = new ExpandedNodeId(Identifiers.ComplexNumberType_Encoding_DefaultBinary);
	public static final ExpandedNodeId XML = new ExpandedNodeId(Identifiers.ComplexNumberType_Encoding_DefaultXml);
	
    protected Float Real;
    protected Float Imaginary;
    
    public ComplexNumberType() {}
    
    public ComplexNumberType(Float Real, Float Imaginary)
    {
        this.Real = Real;
        this.Imaginary = Imaginary;
    }
    
    public Float getReal()
    {
        return Real;
    }
    
    public void setReal(Float Real)
    {
        this.Real = Real;
    }
    
    public Float getImaginary()
    {
        return Imaginary;
    }
    
    public void setImaginary(Float Imaginary)
    {
        this.Imaginary = Imaginary;
    }
    
    /**
      * Deep clone
      *
      * @return cloned ComplexNumberType
      */
    public ComplexNumberType clone()
    {
        ComplexNumberType result = new ComplexNumberType();
        result.Real = Real;
        result.Imaginary = Imaginary;
        return result;
    }
    
    @Override
    public boolean equals(Object obj)
    {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        ComplexNumberType other = (ComplexNumberType) obj;
        if (Real==null) {
            if (other.Real != null) return false;
        } else if (!Real.equals(other.Real)) return false;
        if (Imaginary==null) {
            if (other.Imaginary != null) return false;
        } else if (!Imaginary.equals(other.Imaginary)) return false;
        return true;
    }
    
    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result
                + ((Real == null) ? 0 : Real.hashCode());
        result = prime * result
                + ((Imaginary == null) ? 0 : Imaginary.hashCode());
        return result;
    }
    


	public ExpandedNodeId getTypeId() {
		return ID;
	}

	public ExpandedNodeId getXmlEncodeId() {
		return XML;
	}

	public ExpandedNodeId getBinaryEncodeId() {
		return BINARY;
	}
	
	public String toString() {
		return "ComplexNumberType: "+ObjectUtils.printFieldsDeep(this);
	}

}