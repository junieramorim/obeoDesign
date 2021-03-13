/**
 */
package br.unb.cic.c2system;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Environment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.unb.cic.c2system.Environment#getSensorDegradation <em>Sensor Degradation</em>}</li>
 *   <li>{@link br.unb.cic.c2system.Environment#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see br.unb.cic.c2system.C2systemPackage#getEnvironment()
 * @model
 * @generated
 */
public interface Environment extends EObject {
	/**
	 * Returns the value of the '<em><b>Sensor Degradation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensor Degradation</em>' attribute.
	 * @see #setSensorDegradation(double)
	 * @see br.unb.cic.c2system.C2systemPackage#getEnvironment_SensorDegradation()
	 * @model
	 * @generated
	 */
	double getSensorDegradation();

	/**
	 * Sets the value of the '{@link br.unb.cic.c2system.Environment#getSensorDegradation <em>Sensor Degradation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sensor Degradation</em>' attribute.
	 * @see #getSensorDegradation()
	 * @generated
	 */
	void setSensorDegradation(double value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see br.unb.cic.c2system.C2systemPackage#getEnvironment_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link br.unb.cic.c2system.Environment#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // Environment
