/**
 */
package br.unb.cic.c2system.impl;

import br.unb.cic.c2system.C2Approach;
import br.unb.cic.c2system.C2systemPackage;
import br.unb.cic.c2system.Entity;
import br.unb.cic.c2system.Team;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Team</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.unb.cic.c2system.impl.TeamImpl#getMembers <em>Members</em>}</li>
 *   <li>{@link br.unb.cic.c2system.impl.TeamImpl#getOperates <em>Operates</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TeamImpl extends EntityImpl implements Team {
	/**
	 * The cached value of the '{@link #getMembers() <em>Members</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMembers()
	 * @generated
	 * @ordered
	 */
	protected EList<Entity> members;

	/**
	 * The cached value of the '{@link #getOperates() <em>Operates</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperates()
	 * @generated
	 * @ordered
	 */
	protected C2Approach operates;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TeamImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return C2systemPackage.Literals.TEAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Entity> getMembers() {
		if (members == null) {
			members = new EObjectContainmentEList<Entity>(Entity.class, this, C2systemPackage.TEAM__MEMBERS);
		}
		return members;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public C2Approach getOperates() {
		if (operates != null && operates.eIsProxy()) {
			InternalEObject oldOperates = (InternalEObject) operates;
			operates = (C2Approach) eResolveProxy(oldOperates);
			if (operates != oldOperates) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, C2systemPackage.TEAM__OPERATES,
							oldOperates, operates));
			}
		}
		return operates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public C2Approach basicGetOperates() {
		return operates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperates(C2Approach newOperates, NotificationChain msgs) {
		C2Approach oldOperates = operates;
		operates = newOperates;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					C2systemPackage.TEAM__OPERATES, oldOperates, newOperates);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperates(C2Approach newOperates) {
		if (newOperates != operates) {
			NotificationChain msgs = null;
			if (operates != null)
				msgs = ((InternalEObject) operates).eInverseRemove(this, C2systemPackage.C2_APPROACH__APPLIES,
						C2Approach.class, msgs);
			if (newOperates != null)
				msgs = ((InternalEObject) newOperates).eInverseAdd(this, C2systemPackage.C2_APPROACH__APPLIES,
						C2Approach.class, msgs);
			msgs = basicSetOperates(newOperates, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, C2systemPackage.TEAM__OPERATES, newOperates,
					newOperates));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case C2systemPackage.TEAM__OPERATES:
			if (operates != null)
				msgs = ((InternalEObject) operates).eInverseRemove(this, C2systemPackage.C2_APPROACH__APPLIES,
						C2Approach.class, msgs);
			return basicSetOperates((C2Approach) otherEnd, msgs);
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
		case C2systemPackage.TEAM__MEMBERS:
			return ((InternalEList<?>) getMembers()).basicRemove(otherEnd, msgs);
		case C2systemPackage.TEAM__OPERATES:
			return basicSetOperates(null, msgs);
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
		case C2systemPackage.TEAM__MEMBERS:
			return getMembers();
		case C2systemPackage.TEAM__OPERATES:
			if (resolve)
				return getOperates();
			return basicGetOperates();
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
		case C2systemPackage.TEAM__MEMBERS:
			getMembers().clear();
			getMembers().addAll((Collection<? extends Entity>) newValue);
			return;
		case C2systemPackage.TEAM__OPERATES:
			setOperates((C2Approach) newValue);
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
		case C2systemPackage.TEAM__MEMBERS:
			getMembers().clear();
			return;
		case C2systemPackage.TEAM__OPERATES:
			setOperates((C2Approach) null);
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
		case C2systemPackage.TEAM__MEMBERS:
			return members != null && !members.isEmpty();
		case C2systemPackage.TEAM__OPERATES:
			return operates != null;
		}
		return super.eIsSet(featureID);
	}

} //TeamImpl
