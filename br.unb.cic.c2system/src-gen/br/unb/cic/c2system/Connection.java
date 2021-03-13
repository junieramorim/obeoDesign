/**
 */
package br.unb.cic.c2system;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.unb.cic.c2system.Connection#getSrc <em>Src</em>}</li>
 *   <li>{@link br.unb.cic.c2system.Connection#getTgt <em>Tgt</em>}</li>
 * </ul>
 *
 * @see br.unb.cic.c2system.C2systemPackage#getConnection()
 * @model abstract="true"
 * @generated
 */
public interface Connection extends EObject {
	/**
	 * Returns the value of the '<em><b>Src</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Src</em>' reference.
	 * @see #setSrc(Entity)
	 * @see br.unb.cic.c2system.C2systemPackage#getConnection_Src()
	 * @model required="true"
	 * @generated
	 */
	Entity getSrc();

	/**
	 * Sets the value of the '{@link br.unb.cic.c2system.Connection#getSrc <em>Src</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Src</em>' reference.
	 * @see #getSrc()
	 * @generated
	 */
	void setSrc(Entity value);

	/**
	 * Returns the value of the '<em><b>Tgt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tgt</em>' reference.
	 * @see #setTgt(Entity)
	 * @see br.unb.cic.c2system.C2systemPackage#getConnection_Tgt()
	 * @model required="true"
	 * @generated
	 */
	Entity getTgt();

	/**
	 * Sets the value of the '{@link br.unb.cic.c2system.Connection#getTgt <em>Tgt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tgt</em>' reference.
	 * @see #getTgt()
	 * @generated
	 */
	void setTgt(Entity value);

} // Connection
