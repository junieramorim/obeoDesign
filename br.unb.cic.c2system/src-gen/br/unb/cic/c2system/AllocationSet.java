/**
 */
package br.unb.cic.c2system;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Allocation Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.unb.cic.c2system.AllocationSet#getAllocations <em>Allocations</em>}</li>
 *   <li>{@link br.unb.cic.c2system.AllocationSet#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see br.unb.cic.c2system.C2systemPackage#getAllocationSet()
 * @model
 * @generated
 */
public interface AllocationSet extends EObject {
	/**
	 * Returns the value of the '<em><b>Allocations</b></em>' containment reference list.
	 * The list contents are of type {@link br.unb.cic.c2system.Allocation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocations</em>' containment reference list.
	 * @see br.unb.cic.c2system.C2systemPackage#getAllocationSet_Allocations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Allocation> getAllocations();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see br.unb.cic.c2system.C2systemPackage#getAllocationSet_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link br.unb.cic.c2system.AllocationSet#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // AllocationSet
