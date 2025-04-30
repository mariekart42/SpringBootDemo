<script setup>
import { ref, onMounted } from 'vue'

const message = ref('')

onMounted(async () => {
  const res = await fetch('http://localhost:9090/api/hello')
  message.value = await res.text()
})
</script>

<template>
  <div>
    <h1>{{ message }}</h1>
  </div>
</template>