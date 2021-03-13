/**
 */
package br.unb.cic.c2system.impl;

import br.unb.cic.c2system.C2systemPackage;
import br.unb.cic.c2system.Entity;
import br.unb.cic.c2system.Role;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.unb.cic.c2system.impl.EntityImpl#getRoleassignment <em>Roleassignment</em>}</li>
 *   <li>{@link br.unb.cic.c2system.impl.EntityImpl#isPoc <em>Poc</em>}</li>
 *   <li>{@link br.unb.cic.c2system.impl.EntityImpl#isLeader <em>Leader</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class EntityImpl extends NamedClassImpl implements Entity {
	/**
	 * The cached value of the '{@link #getRoleassignment() <em>Roleassignment</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleassignment()
	 * @generated
	 * @ordered
	 */
	protected EList<Role> roleassignment;

	/**
	 * The default value of the '{@link #isPoc() <em>Poc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPoc()
	 * @generated
	 * @ordered
	 */
	protected static final boolean POC_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPoc() <em>Poc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPoc()
	 * @generated
	 * @ordered
	 */
	protected boolean poc = POC_EDEFAULT;

	/**
	 * The default value of the '{@link #isLeader() <em>Leader</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLeader()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LEADER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isLeader() <em>Leader</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLeader()
	 * @generated
	 * @ordered
	 */
	protected boolean leader = LEADER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return C2systemPackage.Literals.ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Role> getRoleassignment() {
		if (roleassignment == null) {
			roleassignment = new EObjectWithInverseResolvingEList.ManyInverse<Role>(Role.class, this,
					C2systemPackage.ENTITY__ROLEASSIGNMENT, C2systemPackage.ROLE__ENTITY);
		}
		return roleassignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPoc() {
		return poc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPoc(boolean newPoc) {
		boolean oldPoc = poc;
		poc = newPoc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, C2systemPackage.ENTITY__POC, oldPoc, poc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isLeader() {
		return leader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeader(boolean newLeader) {
		boolean oldLeader = leader;
		leader = newLeader;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, C2systemPackage.ENTITY__LEADER, oldLeader, leader));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case C2systemPackage.ENTITY__ROLEASSIGNMENT:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getRoleassignment()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case C2systemPackage.ENTITY__ROLEASSIGNMENT:
			return ((InternalEList<?>) getRoleassignment()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case C2systemPackage.ENTITY__ROLEASSIGNMENT:
			return getRoleassignment();
		case C2systemPackage.ENTITY__POC:
			return isPoc();
		case C2systemPackage.ENTITY__LEADER:
			return isLeader();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case C2systemPackage.ENTITY__ROLEASSIGNMENT:
			getRoleassignment().clear();
			getRoleassignment().addAll((Collection<? extends Role>) newValue);
			return;
		case C2systemPackage.ENTITY__POC:
			setPoc((Boolean) newValue);
			return;
		case C2systemPackage.ENTITY__LEADER:
			setLeader((Boolean) newValue);
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
		case C2systemPackage.ENTITY__ROLEASSIGNMENT:
			getRoleassignment().clear();
			return;
		case C2systemPackage.ENTITY__POC:
			setPoc(POC_EDEFAULT);
			return;
		case C2systemPackage.ENTITY__LEADER:
			setLeader(LEADER_EDEFAULT);
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
		case C2systemPackage.ENTITY__ROLEASSIGNMENT:
			return roleassignment != null && !roleassignment.isEmpty();
		case C2systemPackage.ENTITY__POC:
			return poc != POC_EDEFAULT;
		case C2systemPackage.ENTITY__LEADER:
			return leader != LEADER_EDEFAULT;
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
		result.append(" (poc: ");
		result.append(poc);
		result.append(", leader: ");
		result.append(leader);
		result.append(')');
		return result.toString();
	}

} //EntityImpl
