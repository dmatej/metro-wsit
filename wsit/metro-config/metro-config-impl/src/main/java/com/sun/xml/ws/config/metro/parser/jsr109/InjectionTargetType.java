/*
 * Copyright (c) 2010, 2021 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Distribution License v. 1.0, which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: BSD-3-Clause
 */

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-28 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.08.18 at 11:59:48 AM EEST 
//


package com.sun.xml.ws.config.metro.parser.jsr109;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlTransient;
import jakarta.xml.bind.annotation.XmlType;
import org.glassfish.jaxb.core.Locatable;
import org.glassfish.jaxb.core.annotation.XmlLocation;
import org.xml.sax.Locator;


/**
 * 
 * 
 *         An injection target specifies a class and a name within
 *         that class into which a resource should be injected.
 *         
 *         The injection target class specifies the fully qualified
 *         class name that is the target of the injection.  The
 *         Java EE specifications describe which classes can be an
 *         injection target.
 *         
 *         The injection target name specifies the target within
 *         the specified class.  The target is first looked for as a
 *         JavaBeans property name.  If not found, the target is
 *         looked for as a field name.
 *         
 *         The specified resource will be injected into the target
 *         during initialization of the class by either calling the
 *         set method for the target property or by setting a value
 *         into the named field.
 *         
 *       
 * 
 * <p>Java class for injection-targetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="injection-targetType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="injection-target-class" type="{http://java.sun.com/xml/ns/javaee}fully-qualified-classType"/>
 *         <element name="injection-target-name" type="{http://java.sun.com/xml/ns/javaee}java-identifierType"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "injection-targetType", propOrder = {
    "injectionTargetClass",
    "injectionTargetName"
})
public class InjectionTargetType
    implements Locatable
{

    @XmlElement(name = "injection-target-class", required = true)
    protected FullyQualifiedClassType injectionTargetClass;
    @XmlElement(name = "injection-target-name", required = true)
    protected JavaIdentifierType injectionTargetName;
    @XmlLocation
    @XmlTransient
    protected Locator locator;

    /**
     * Gets the value of the injectionTargetClass property.
     * 
     * @return
     *     possible object is
     *     {@link FullyQualifiedClassType }
     *     
     */
    public FullyQualifiedClassType getInjectionTargetClass() {
        return injectionTargetClass;
    }

    /**
     * Sets the value of the injectionTargetClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link FullyQualifiedClassType }
     *     
     */
    public void setInjectionTargetClass(FullyQualifiedClassType value) {
        this.injectionTargetClass = value;
    }

    /**
     * Gets the value of the injectionTargetName property.
     * 
     * @return
     *     possible object is
     *     {@link JavaIdentifierType }
     *     
     */
    public JavaIdentifierType getInjectionTargetName() {
        return injectionTargetName;
    }

    /**
     * Sets the value of the injectionTargetName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JavaIdentifierType }
     *     
     */
    public void setInjectionTargetName(JavaIdentifierType value) {
        this.injectionTargetName = value;
    }

    @Override
    public Locator sourceLocation() {
        return locator;
    }

    public void setSourceLocation(Locator newLocator) {
        locator = newLocator;
    }

}
