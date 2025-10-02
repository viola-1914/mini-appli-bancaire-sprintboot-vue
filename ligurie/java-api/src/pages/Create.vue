<template>
    
   <form action="">
    <h4>Creer un utilisateur</h4>
    <div class="info">
        <label for="firstName">firstName:</label>
        <input type="text" placeholder="inter firstname" v-model="firstName">
    </div>

    <div class="info">
        <label for="lasName">lasName:</label>
        <input type="text" placeholder="inter firstname" v-model="lasName">
    </div>

    <div class="info">
        <label for="email">email:</label>
        <input type="text" placeholder="inter email" v-model="email">
    </div>

    <div class="info">
        <label for="phone">phone:</label>
        <input type="text" placeholder="inter phone" v-model="phone">
    </div>

    <div class="info">
        <label for="address">Addess:</label>
        <input type="text" placeholder="inter address" v-model="address">
    </div>

    <div class="info">
        <label for="gender">gender:</label>
        <input type="text" placeholder="inter gender" v-model="gender">
    </div>

    <div class="info">
        <label for="password">password:</label>
        <input type="text" placeholder="inter password" v-model="password">
    </div>

    <button @click="Create">Envoyer</button>
   </form>
</template>

<script setup>
import { ref } from 'vue';

let firstName = ref(null);
let lasName = ref(null);
let email = ref(null);
let phone = ref(null);
let address = ref(null);
let gender = ref(null);
let password = ref(null);
function Create(e){
     e.preventDefault();
     
   fetch("http://localhost:8091/api/user/create", {
    method:"POST", 
    headers: {
    "Content-Type": "application/json" // on précise qu’on envoie du JSON
  },
  body:JSON.stringify(
    {
  "firstName": firstName.value,
  "lastName": lasName.value,
  "email": email.value,
  "phone": phone.value,
  "address": address.value,
  "gender": gender.value,
  "password": password.value
    }
  )
    }).then(res => {
      if (!res.ok) {
        throw new Error("Erreur du serveur");
      }
      
    })
    .then(data => {
      alert("✅ Infos bien enregistrées !");
      console.log(data);
    })
    .catch(error => {
      alert("❌ Échec : " + error.message);
      console.error(error);
    });
    
    firstName.value = ""
    lasName.value = ""
    email.value = ""
    phone.value = ""
    address.value = ""
    gender.value = ""
    password.value = ""
}



</script>

<style  scoped>
*{
    margin: 0;
    padding: 0;
    box-sizing: border-box;
}
:root {
  --main-color: red; /* définition */
  --secondary-color: rgb(255, 99, 71);
}
form{
    max-width: 300px;
    width: 100%;
    display: flex;
    justify-content: center;
    align-items: center;
    flex-direction: column;
    border: 1px solid var(--main-color);
    margin: auto;
    border-radius: 10px ;
}
.info{
    display: flex;
    margin-top: 20px;
    width: 100%;
}

input{
    width: 100%;
    padding: 5px;
    box-shadow: 2px 2px 2px rgb(243, 144, 144);
    outline-color: var(--main-color);
    border-radius: 10px;
    border: 1px solid var(--main-color);
}
form button{
    margin-top: 15px;
    margin-bottom: 15px;
    padding: 5px;
    width: 100%;
    border-radius: 10px;
    color: white;
    background-color: var(--main-color);
}
</style>