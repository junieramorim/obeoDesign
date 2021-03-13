/**
 */
package br.unb.cic.c2system.impl;

import br.unb.cic.c2system.C2systemPackage;
import br.unb.cic.c2system.Environment;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Environment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.unb.cic.c2system.impl.EnvironmentImpl#getSensorDegradation <em>Sensor Degradation</em>}</li>
 *   <li>{@link br.unb.cic.c2system.impl.EnvironmentImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnvironmentImpl extends MinimalEObjectImpl.Container implements Environment {
	/**
	 * The default value of the '{@link #getSensorDegradation() <em>Sensor Degradation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensorDegradation()
	 * @generated
	 * @ordered
	 */
	protected static final double SENSOR_DEGRADATION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSensorDegradation() <em>Sensor Degradation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensorDegradation()
	 * @generated
	 * @ordered
	 */
	protected double sensorDegradation = SENSOR_DEGRADATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnvironmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return C2systemPackage.Literals.ENVIRONMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSensorDegradation() {
		return sensorDegradation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSensorDegradation(double newSensorDegradation) {
		double oldSensorDegradation = sensorDegradation;
		sensorDegradation = newSensorDegradation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, C2systemPackage.ENVIRONMENT__SENSOR_DEGRADATION,
					oldSensorDegradation, sensorDegradation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, C2systemPackage.ENVIRONMENT__DESCRIPTION,
					oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case C2systemPackage.ENVIRONMENT__SENSOR_DEGRADATION:
			return getSensorDegradation();
		case C2systemPackage.ENVIRONMENT__DESCRIPTION:
			return getDescription();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case C2systemPackage.ENVIRONMENT__SENSOR_DEGRADATION:
			setSensorDegradation((Double) newValue);
			return;
		case C2systemPackage.ENVIRONMENT__DESCRIPTION:
			setDescription((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case C2systemPackage.ENVIRONMENT__SENSOR_DEGRADATION:
			setSensorDegradation(SENSOR_DEGRADATION_EDEFAULT);
			return;
		case C2systemPackage.ENVIRONMENT__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case C2systemPackage.ENVIRONMENT__SENSOR_DEGRADATION:
			return sensorDegradation != SENSOR_DEGRADATION_EDEFAULT;
		case C2systemPackage.ENVIRONMENT__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (sensorDegradation: ");
		result.append(sensorDegradation);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //EnvironmentImpl
