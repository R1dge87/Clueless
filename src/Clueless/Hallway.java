/**
 */
package Clueless;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hallway</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Clueless.Hallway#getHasPerson <em>Has Person</em>}</li>
 *   <li>{@link Clueless.Hallway#getPlayerList <em>Player List</em>}</li>
 *   <li>{@link Clueless.Hallway#getAdjacentRoomList <em>Adjacent Room List</em>}</li>
 * </ul>
 *
 * @see Clueless.MainPackage#getHallway()
 * @model
 * @generated
 */
public interface Hallway extends EObject {
	/**
	 * Returns the value of the '<em><b>Has Person</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Person</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Person</em>' attribute list.
	 * @see Clueless.MainPackage#getHallway_HasPerson()
	 * @model
	 * @generated
	 */
	EList<Boolean> getHasPerson();

	/**
	 * Returns the value of the '<em><b>Player List</b></em>' reference list.
	 * The list contents are of type {@link Clueless.Player}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Player List</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Player List</em>' reference list.
	 * @see Clueless.MainPackage#getHallway_PlayerList()
	 * @model
	 * @generated
	 */
	EList<Player> getPlayerList();

	/**
	 * Returns the value of the '<em><b>Adjacent Room List</b></em>' reference list.
	 * The list contents are of type {@link Clueless.Room}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Adjacent Room List</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adjacent Room List</em>' reference list.
	 * @see Clueless.MainPackage#getHallway_AdjacentRoomList()
	 * @model
	 * @generated
	 */
	EList<Room> getAdjacentRoomList();
	

} // Hallway
