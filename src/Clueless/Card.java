/**
 */
package Clueless;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Card</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Clueless.Card#getWeapon <em>Weapon</em>}</li>
 *   <li>{@link Clueless.Card#getPerson <em>Person</em>}</li>
 *   <li>{@link Clueless.Card#getRoom <em>Room</em>}</li>
 * </ul>
 *
 * @see Clueless.NullPackage#getCard()
 * @model
 * @generated
 */
public interface Card extends EObject {
	/**
	 * Returns the value of the '<em><b>Weapon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Weapon</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weapon</em>' attribute.
	 * @see #setWeapon(String)
	 * @see Clueless.NullPackage#getCard_Weapon()
	 * @model
	 * @generated
	 */
	String getWeapon();

	/**
	 * Sets the value of the '{@link Clueless.Card#getWeapon <em>Weapon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weapon</em>' attribute.
	 * @see #getWeapon()
	 * @generated
	 */
	void setWeapon(String value);

	/**
	 * Returns the value of the '<em><b>Person</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Person</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Person</em>' attribute.
	 * @see #setPerson(String)
	 * @see Clueless.NullPackage#getCard_Person()
	 * @model
	 * @generated
	 */
	String getPerson();

	/**
	 * Sets the value of the '{@link Clueless.Card#getPerson <em>Person</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Person</em>' attribute.
	 * @see #getPerson()
	 * @generated
	 */
	void setPerson(String value);

	/**
	 * Returns the value of the '<em><b>Room</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room</em>' attribute.
	 * @see #setRoom(String)
	 * @see Clueless.NullPackage#getCard_Room()
	 * @model
	 * @generated
	 */
	String getRoom();

	/**
	 * Sets the value of the '{@link Clueless.Card#getRoom <em>Room</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room</em>' attribute.
	 * @see #getRoom()
	 * @generated
	 */
	void setRoom(String value);

} // Card
