/**
 */
package Clueless.impl;

import Clueless.Hallway;
import Clueless.MainPackage;
import Clueless.Player;
import Clueless.Room;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hallway</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Clueless.impl.HallwayImpl#getHasPerson <em>Has Person</em>}</li>
 *   <li>{@link Clueless.impl.HallwayImpl#getPlayerList <em>Player List</em>}</li>
 *   <li>{@link Clueless.impl.HallwayImpl#getAdjacentRoomList <em>Adjacent Room List</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HallwayImpl extends MinimalEObjectImpl.Container implements Hallway {
	/**
	 * The cached value of the '{@link #getHasPerson() <em>Has Person</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasPerson()
	 * @generated
	 * @ordered
	 */
	protected EList<Boolean> hasPerson;

	/**
	 * The cached value of the '{@link #getPlayerList() <em>Player List</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlayerList()
	 * @generated
	 * @ordered
	 */
	protected EList<Player> playerList;

	/**
	 * The cached value of the '{@link #getAdjacentRoomList() <em>Adjacent Room List</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdjacentRoomList()
	 * @generated
	 * @ordered
	 */
	protected EList<Room> adjacentRoomList;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HallwayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MainPackage.Literals.HALLWAY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Boolean> getHasPerson() {
		if (hasPerson == null) {
			hasPerson = new EDataTypeUniqueEList<Boolean>(Boolean.class, this, MainPackage.HALLWAY__HAS_PERSON);
		}
		return hasPerson;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Player> getPlayerList() {
		if (playerList == null) {
			playerList = new EObjectResolvingEList<Player>(Player.class, this, MainPackage.HALLWAY__PLAYER_LIST);
		}
		return playerList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Room> getAdjacentRoomList() {
		if (adjacentRoomList == null) {
			adjacentRoomList = new EObjectResolvingEList<Room>(Room.class, this, MainPackage.HALLWAY__ADJACENT_ROOM_LIST);
		}
		return adjacentRoomList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MainPackage.HALLWAY__HAS_PERSON:
				return getHasPerson();
			case MainPackage.HALLWAY__PLAYER_LIST:
				return getPlayerList();
			case MainPackage.HALLWAY__ADJACENT_ROOM_LIST:
				return getAdjacentRoomList();
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
			case MainPackage.HALLWAY__HAS_PERSON:
				getHasPerson().clear();
				getHasPerson().addAll((Collection<? extends Boolean>)newValue);
				return;
			case MainPackage.HALLWAY__PLAYER_LIST:
				getPlayerList().clear();
				getPlayerList().addAll((Collection<? extends Player>)newValue);
				return;
			case MainPackage.HALLWAY__ADJACENT_ROOM_LIST:
				getAdjacentRoomList().clear();
				getAdjacentRoomList().addAll((Collection<? extends Room>)newValue);
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
			case MainPackage.HALLWAY__HAS_PERSON:
				getHasPerson().clear();
				return;
			case MainPackage.HALLWAY__PLAYER_LIST:
				getPlayerList().clear();
				return;
			case MainPackage.HALLWAY__ADJACENT_ROOM_LIST:
				getAdjacentRoomList().clear();
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
			case MainPackage.HALLWAY__HAS_PERSON:
				return hasPerson != null && !hasPerson.isEmpty();
			case MainPackage.HALLWAY__PLAYER_LIST:
				return playerList != null && !playerList.isEmpty();
			case MainPackage.HALLWAY__ADJACENT_ROOM_LIST:
				return adjacentRoomList != null && !adjacentRoomList.isEmpty();
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
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (hasPerson: ");
		result.append(hasPerson);
		result.append(')');
		return result.toString();
	}

} //HallwayImpl
