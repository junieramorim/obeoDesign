/**
 */
package br.unb.cic.c2system;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Allocation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.unb.cic.c2system.Allocation#getHandler <em>Handler</em>}</li>
 *   <li>{@link br.unb.cic.c2system.Allocation#getAssignment <em>Assignment</em>}</li>
 *   <li>{@link br.unb.cic.c2system.Allocation#getId <em>Id</em>}</li>
 *   <li>{@link br.unb.cic.c2system.Allocation#getTimestamp <em>Timestamp</em>}</li>
 * </ul>
 *
 * @see br.unb.cic.c2system.C2systemPackage#getAllocation()
 * @model
 * @generated
 */
public interface Allocation extends EObject {
	/**
	 * Returns the value of the '<em><b>Handler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Handler</em>' reference.
	 * @see #setHandler(Entity)
	 * @see br.unb.cic.c2system.C2systemPackage#getAllocation_Handler()
	 * @model required="true"
	 * @generated
	 */
	Entity getHandler();

	/**
	 * Sets the value of the '{@link br.unb.cic.c2system.Allocation#getHandler <em>Handler</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Handler</em>' reference.
	 * @see #getHandler()
	 * @generated
	 */
	void setHandler(Entity value);

	/**
	 * Returns the value of the '<em><b>Assignment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assignment</em>' reference.
	 * @see #setAssignment(Allocable)
	 * @see br.unb.cic.c2system.C2systemPackage#getAllocation_Assignment()
	 * @model required="true"
	 * @generated
	 */
	Allocable getAssignment();

	/**
	 * Sets the value of the '{@link br.unb.cic.c2system.Allocation#getAssignment <em>Assignment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assignment</em>' reference.
	 * @see #getAssignment()
	 * @generated
	 */
	void setAssignment(Allocable value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see br.unb.cic.c2system.C2systemPackage#getAllocation_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link br.unb.cic.c2system.Allocation#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timestamp</em>' attribute.
	 * @see #setTimestamp(float)
	 * @see br.unb.cic.c2system.C2systemPackage#getAllocation_Timestamp()
	 * @model
	 * @generated
	 */
	float getTimestamp();

	/**
	 * Sets the value of the '{@link br.unb.cic.c2system.Allocation#getTimestamp <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timestamp</em>' attribute.
	 * @see #getTimestamp()
	 * @generated
	 */
	void setTimestamp(float value);

} // Allocation
